/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/problems")
public interface ProblemsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response getProblems(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{problemLocator}")
    Response serveInstance(@PathParam("problemLocator") String problemLocator, @QueryParam("fields") String fields);

}
