package org.jetbrains.teamcity.rest.client

import com.google.api.client.http.GenericUrl
import com.google.api.client.http.HttpContent
import com.google.api.client.http.HttpRequestFactory
import com.google.api.client.http.HttpResponse
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.GenericJson
import com.google.api.client.json.Json
import com.google.api.client.json.JsonObjectParser
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.client.util.ObjectParser
import java.util.Collections
import kotlin.test.assertNotNull
import org.jetbrains.teamcity.rest.client.RequestsProcessor.Method
import com.google.api.client.http.json.JsonHttpContent

class HTTP(val config: ConnectionConfig) : RequestsProcessor {

    override fun asJson(data: Any): JsonHttpContent {
        return JsonHttpContent(jsonFactory, data);
    }

    val root: GenericUrl = GenericUrl(config.getRestUrl())
    val factory: HttpRequestFactory = NetHttpTransport().createRequestFactory(config.auth)!!
    class object {
        private val jsonFactory = JacksonFactory()
        private val jsonParser = JsonObjectParser(jsonFactory)
    }

    override fun request(path: String, method: Method, content: HttpContent?, headers: Map<String, String>?, parser: ObjectParser?): HttpResponse {

        if ( method == Method.POST ) {
            assertNotNull(content, "POST request requires content")
        }

        val url = config.getUrl(path)

        val request = when (method) {
            Method.HEAD -> factory.buildHeadRequest(url)
            Method.GET -> factory.buildGetRequest (url)
            Method.POST -> factory.buildPostRequest(url, content!!)
            else -> throw IllegalStateException("Unsuppored type ${method}")
        }

        val rh = request.getHeaders()
        if ( headers != null ) {
            for ( (k, v) in headers.entrySet() ) {
                try {
                    rh.set(k, v)
                } catch(e: Exception) {
                    try {
                        rh.set(k, listOf(v))
                    } catch(e: Exception) {
                    }
                }
            }
        }
        if (rh.get("Accept") == null) {
            rh.put("Accept", listOf(Json.MEDIA_TYPE, "text/plain"))
        }

        request.setParser(parser?:jsonParser)
        // Debug ;)
        request.setConnectTimeout(1000000)
        request.setReadTimeout(1000000)
        request.setFollowRedirects(true);
        val response = request.setThrowExceptionOnExecuteError(false).execute()!!

        return response
    }


    override fun head (url: String): HttpResponse = request(url, Method.HEAD)

    override fun get (url: String): HttpResponse = request(url, Method.GET)

    override fun post (url: String, content: HttpContent): HttpResponse = request(url, Method.POST, content)

    override fun status (url: String): Int = head(url).getStatusCode()

    override fun getAsString (url: String): String = get(url).parseAsString()!!

    override fun getAsJson (url: String): GenericJson = getAs(url, javaClass<GenericJson>())

    override fun getAs<T> (url: String, rtype: Class<T>): T {
        val response = request(method = Method.GET, path = url, headers = Collections.singletonMap("Accept", Json.MEDIA_TYPE), parser = jsonParser)
        return response.parseAs(rtype)!!
    }

    override fun getSafeAs<T> (url: String, rtype: Class<T>): Triple<T?, Exception?, HttpResponse> {
        val response = request(method = Method.GET, path = url, headers = Collections.singletonMap("Accept", Json.MEDIA_TYPE), parser = jsonParser)
        val parsed: T?
        val exception: Exception?
        try {
            parsed = response.parseAs(rtype)
            exception = null
        } catch(e: Exception) {
            parsed = null
            exception = e
        }
        return Triple<T?, Exception?, HttpResponse>(parsed, exception, response)
    }
}
