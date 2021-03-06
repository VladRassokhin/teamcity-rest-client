/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/debug")
public interface DebugResource {

    @GET
    @Produces("text/plain; charset=UTF-8")
    @Path("/database/query/{query}")
    Response executeDBQuery(@PathParam("query") String query, @QueryParam("fieldDelimiter") @DefaultValue(", ") String fieldDelimiter, @QueryParam("count") @DefaultValue("1000") Integer count);

    @POST
    @Produces({"application/xml", "application/json" })
    @Path("/vcsCheckingForChangesQueue")
    Response scheduleCheckingForChanges(@QueryParam("locator") String locator);

    @GET
    @Produces("text/plain; charset=UTF-8")
    @Path("/database/tables")
    Response listDBTables();

}
