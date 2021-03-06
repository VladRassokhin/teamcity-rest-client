package generated.resources;

import generated.data.Investigation;
import generated.data.Investigations;
import generated.TeamCityClient;
import org.glassfish.jersey.uri.UriTemplate;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Experimental, the requests and results returned will change in future versions!
 */
public class AppRestInvestigations extends AbstractAppRest {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestInvestigations(Client client, URI baseUri, TeamCityClient tjc) {
    super(tjc);
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/investigations");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public Investigations get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
    Utils.throwExceptionIfWrongStatus(response);
    return response.readEntity(Investigations.class);
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public Investigations get(String locator, String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
    Utils.throwExceptionIfWrongStatus(response);
    return response.readEntity(Investigations.class);
  }

  public InvestigationLocator investigationLocator(String investigationlocator) {
    return new InvestigationLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), investigationlocator);
  }

  public class InvestigationLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private InvestigationLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public InvestigationLocator(Client client, URI baseUri, String investigationlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{investigationLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("investigationLocator", investigationlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public InvestigationLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/investigations/{investigationLocator}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get investigationLocator
     */
    public String getInvestigationlocator() {
      return ((String) _templateAndMatrixParameterValues.get("investigationLocator"));
    }

    /**
     * Duplicate state and set investigationLocator
     */
    public InvestigationLocator setInvestigationlocator(String investigationlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("investigationLocator", investigationlocator);
      return new InvestigationLocator(_client, copyUriBuilder, copyMap);
    }

    public Investigation get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Investigation.class);
    }

    public Investigation get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Investigation.class);
    }
  }
}
