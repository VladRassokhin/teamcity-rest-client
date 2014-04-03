/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/app/rest/userGroups")
public interface UserGroupsResource {

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Response addGroup(@QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    Response serveGroups(@QueryParam("fields") String fields);

    @DELETE
    @Path("/{groupLocator}")
    void deleteGroup(@PathParam("groupLocator") String groupLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}")
    Response serveGroup(@PathParam("groupLocator") String groupLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}/roles")
    Response addRolePut(@PathParam("groupLocator") String groupLocator);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}/roles")
    Response addRole(@PathParam("groupLocator") String groupLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}/roles")
    Response listRoles(@PathParam("groupLocator") String groupLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}/roles/{roleId}/{scope}")
    Response listRole(@PathParam("groupLocator") String groupLocator, @PathParam("scope") String scope, @PathParam("roleId") String roleId);

    @POST
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}/roles/{roleId}/{scope}")
    Response addRoleSimple(@PathParam("groupLocator") String groupLocator, @PathParam("scope") String scope, @PathParam("roleId") String roleId);

    @DELETE
    @Path("/{groupLocator}/roles/{roleId}/{scope}")
    void deleteRole(@PathParam("groupLocator") String groupLocator, @PathParam("scope") String scope, @PathParam("roleId") String roleId);

}
