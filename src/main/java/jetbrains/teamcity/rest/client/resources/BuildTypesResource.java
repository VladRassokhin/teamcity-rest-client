/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import jetbrains.teamcity.rest.client.model.BuildType;
import jetbrains.teamcity.rest.client.model.BuildTypes;
import jetbrains.teamcity.rest.client.model.PropEntityStep;
import jetbrains.teamcity.rest.client.model.VcsRootEntry;
import org.jetbrains.annotations.NotNull;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/buildTypes")
public interface BuildTypesResource {

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    BuildType addBuildType(@NotNull BuildType type);

    @GET
    @Produces({"application/xml", "application/json"})
    BuildType getBuildType(@QueryParam("locator") Locator locator);

    @GET
    @Produces({"application/xml", "application/json"})
    BuildTypes getBuildTypes(@QueryParam("locator") Locator locator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements")
    Response getAgentRequirements(@PathParam("btLocator") Locator btLocator);

  @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements")
  Response addAgentRequirement(@PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements")
  Response replaceAgentRequirements(@PathParam("btLocator") Locator btLocator);

  @POST
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features")
  Response addFeature(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features")
  Response getFeatures(@PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features")
  Response replaceFeatures(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies/{snapshotDepLocator}")
  Response getSnapshotDep(@PathParam("btLocator") Locator btLocator, @PathParam("snapshotDepLocator") String snapshotDepLocator);

  @DELETE
    @Path("/{btLocator}/snapshot-dependencies/{snapshotDepLocator}")
  void deleteSnapshotDep(@PathParam("btLocator") Locator btLocator, @PathParam("snapshotDepLocator") String snapshotDepLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies/{snapshotDepLocator}")
  Response replaceSnapshotDep(@PathParam("btLocator") Locator btLocator, @PathParam("snapshotDepLocator") String snapshotDepLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries/{id}")
  Response getVcsRootEntry(@PathParam("id") String id, @PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries/{id}")
  Response updateVcsRootEntry(@PathParam("id") String id, @PathParam("btLocator") Locator btLocator);

  @DELETE
    @Path("/{btLocator}/vcs-root-entries/{id}")
  void deleteVcsRootEntry(@PathParam("id") String id, @PathParam("btLocator") Locator btLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies/{artifactDepLocator}")
  Response getArtifactDep(@PathParam("btLocator") Locator btLocator, @PathParam("artifactDepLocator") String artifactDepLocator);

  @DELETE
    @Path("/{btLocator}/artifact-dependencies/{artifactDepLocator}")
  void deleteArtifactDep(@PathParam("btLocator") Locator btLocator, @PathParam("artifactDepLocator") String artifactDepLocator);

  @PUT
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies/{artifactDepLocator}")
  Response replaceArtifactDep(@PathParam("btLocator") Locator btLocator, @PathParam("artifactDepLocator") String artifactDepLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers/{triggerLocator}")
  Response getTrigger(@PathParam("btLocator") Locator btLocator, @PathParam("triggerLocator") String triggerLocator);

  @DELETE
    @Path("/{btLocator}/triggers/{triggerLocator}")
  void deleteTrigger(@PathParam("btLocator") Locator btLocator, @PathParam("triggerLocator") String triggerLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers/{triggerLocator}")
  Response replaceTrigger(@PathParam("btLocator") Locator btLocator, @PathParam("triggerLocator") String triggerLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements/{agentRequirementLocator}")
  Response getAgentRequirement(@PathParam("btLocator") Locator btLocator, @PathParam("agentRequirementLocator") String agentRequirementLocator);

  @DELETE
    @Path("/{btLocator}/agent-requirements/{agentRequirementLocator}")
  void deleteAgentRequirement(@PathParam("btLocator") Locator btLocator, @PathParam("agentRequirementLocator") String agentRequirementLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements/{agentRequirementLocator}")
  Response replaceAgentRequirement(@PathParam("btLocator") Locator btLocator, @PathParam("agentRequirementLocator") String agentRequirementLocator);

  @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/parameters/{name}")
  Response setParameterValue(@PathParam("btLocator") Locator btLocator, @PathParam("name") String name);

  @GET
    @Produces("text/plain")
    @Path("/{btLocator}/parameters/{name}")
  Response getParameterValue(@PathParam("btLocator") Locator btLocator, @PathParam("name") String name);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters/{name}")
  Response getParameter(@PathParam("btLocator") Locator btLocator, @PathParam("name") String name);

  @DELETE
    @Path("/{btLocator}/parameters/{name}")
  void deleteBuildTypeParameter(@PathParam("btLocator") Locator btLocator, @PathParam("name") String name);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers")
  Response getTriggers(@PathParam("btLocator") Locator btLocator);

  @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers")
  Response addTrigger(@PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers")
  Response replaceTriggers(@PathParam("btLocator") Locator btLocator);

  @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps")
  PropEntityStep addStep(@PathParam("btLocator") Locator btLocator, PropEntityStep step);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps")
  Response getSteps(@PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps")
  Response replaceSteps(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/investigations")
  Response getInvestigations(@PathParam("btLocator") Locator btLocator, @QueryParam("fields") String fields);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries")
  Response getVcsRootEntries(@PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries")
  Response replaceVcsRootEntries(@PathParam("btLocator") Locator btLocator);

  @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries")
  VcsRootEntry addVcsRootEntry(@PathParam("btLocator") Locator btLocator, @NotNull VcsRootEntry entry);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}")
  PropEntityStep getStep(@PathParam("btLocator") Locator btLocator, @PathParam("stepId") String stepId);

  @DELETE
    @Path("/{btLocator}/steps/{stepId}")
  void deleteStep(@PathParam("btLocator") Locator btLocator, @PathParam("stepId") String stepId);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}")
  Response replaceStep(@PathParam("btLocator") Locator btLocator, @PathParam("stepId") String stepId);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}/parameters")
  Response getStepParameters(@PathParam("btLocator") Locator btLocator, @PathParam("stepId") String stepId);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}/parameters")
  Response replaceStepParameters(@PathParam("btLocator") Locator btLocator, @PathParam("stepId") String stepId);

  @GET
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/parameters/{parameterName}")
  Response getStepParameter(@PathParam("btLocator") Locator btLocator, @PathParam("stepId") String stepId, @PathParam("parameterName") String parameterName);

  @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/parameters/{parameterName}")
  Response addStepParameter(@PathParam("btLocator") Locator btLocator, @PathParam("stepId") String stepId, @PathParam("parameterName") String parameterName);

  @GET
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/{fieldName}")
  Response getStepSetting(@PathParam("btLocator") Locator btLocator, @PathParam("fieldName") String fieldName, @PathParam("stepId") String stepId);

  @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/{fieldName}")
  Response changeStepSetting(@PathParam("btLocator") Locator btLocator, @PathParam("fieldName") String fieldName, @PathParam("stepId") String stepId);

  @DELETE
    @Path("/{btLocator}/features/{featureId}")
  void deleteFeature(@PathParam("btLocator") Locator btLocator, @PathParam("featureId") String featureId);

  @PUT
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}")
  Response replaceFeature(@PathParam("btLocator") Locator btLocator, @PathParam("featureId") String featureId);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}")
  Response getFeature(@PathParam("btLocator") Locator btLocator, @PathParam("featureId") String featureId);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}/parameters")
  Response getFeatureParameters(@PathParam("btLocator") Locator btLocator, @PathParam("featureId") String featureId);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}/parameters")
  Response replaceFeatureParameters(@PathParam("btLocator") Locator btLocator, @PathParam("featureId") String featureId);

  @GET
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/parameters/{parameterName}")
  Response getFeatureParameter(@PathParam("btLocator") Locator btLocator, @PathParam("featureId") String featureId, @PathParam("parameterName") String parameterName);

  @PUT
    @Consumes("*/*")
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/parameters/{parameterName}")
  Response addFeatureParameter(@PathParam("btLocator") Locator btLocator, @PathParam("featureId") String featureId, @PathParam("parameterName") String parameterName);

  @GET
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/{name}")
  Response getFeatureSetting(@PathParam("btLocator") Locator btLocator, @PathParam("name") String name, @PathParam("featureId") String featureId);

  @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/{name}")
  Response changeFeatureSetting(@PathParam("btLocator") Locator btLocator, @PathParam("name") String name, @PathParam("featureId") String featureId);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies")
  Response getArtifactDeps(@PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies")
  Response replaceArtifactDeps(@PathParam("btLocator") Locator btLocator);

  @POST
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies")
  Response addArtifactDep(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies")
  Response getSnapshotDeps(@PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies")
  Response replaceSnapshotDeps(@PathParam("btLocator") Locator btLocator);

  @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies")
  Response addSnapshotDep(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces("text/plain")
    @Path("/{btLocator}/triggers/{triggerLocator}/{fieldName}")
  Response getTriggerSetting(@PathParam("btLocator") Locator btLocator, @PathParam("triggerLocator") String triggerLocator, @PathParam("fieldName") String fieldName);

  @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/triggers/{triggerLocator}/{fieldName}")
  Response changeTriggerSetting(@PathParam("btLocator") Locator btLocator, @PathParam("triggerLocator") String triggerLocator, @PathParam("fieldName") String fieldName);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcsLabeling")
  Response getVCSLabelingOptions(@PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcsLabeling")
  Response setVCSLabelingOptions(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces("*/*")
    @Path("/{btLocator}/vcs/files/latest/content{path:(/.*)?}")
  Response getVcsFileContent(@PathParam("btLocator") Locator btLocator, @PathParam("path") String path, @QueryParam("resolveParameters") Boolean resolveParameters);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs/files/latest/children{path:(/.*)?}")
  Response getVcsFileListing(@PathParam("btLocator") Locator btLocator, @PathParam("path") String path, @QueryParam("resolveParameters") Boolean resolveParameters);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs/files/latest/metadata{path:(/.*)?}")
  Response getVcsFile(@PathParam("btLocator") Locator btLocator, @PathParam("path") String path, @QueryParam("resolveParameters") Boolean resolveParameters);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/newBuildTypeDescription")
  Response getExampleNewProjectDescriptionCompatibilityVersion1(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/example/newBuildTypeDescription")
  Response getExampleNewProjectDescription(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-instances")
  Response getCurrentVcsInstances(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/builds")
  Response serveBuilds(@PathParam("btLocator") Locator btLocator, @QueryParam("status") String status, @QueryParam("triggeredByUser") String triggeredByUser, @QueryParam("includePersonal") Boolean includePersonal,
                       @QueryParam("includeCanceled") Boolean includeCanceled, @QueryParam("onlyPinned") Boolean onlyPinned, @QueryParam("tag") String tag, @QueryParam("agentName") String agentName,
                       @QueryParam("sinceBuild") String sinceBuild, @QueryParam("sinceDate") String sinceDate, @QueryParam("start") Long start, @QueryParam("count") Integer count,
                       @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/builds/{buildLocator}")
    Response serveBuildWithProject(@PathParam("btLocator") Locator btLocator, @PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields);

  @GET
    @Produces("text/plain")
    @Path("/{btLocator}/builds/{buildLocator}/{field}")
  Response serveBuildField(@PathParam("field") String field, @PathParam("btLocator") Locator btLocator, @PathParam("buildLocator") String buildLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/branches")
  Response serveBranches(@PathParam("btLocator") Locator btLocator, @QueryParam("locator") String locator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}")
  Response serveBuildTypeXML(@PathParam("btLocator") Locator btLocator, @QueryParam("fields") String fields);

  @DELETE
    @Path("/{btLocator}")
  void deleteBuildType(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces("text/plain")
    @Path("/{btLocator}/{field}")
  Response serveBuildTypeField(@PathParam("field") String field, @PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/{field}")
  Response setBuildTypeField(@PathParam("field") String field, @PathParam("btLocator") Locator btLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/buildTags")
  Response serveBuildTypeBuildsTags(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters")
  Response serveBuildTypeParameters(@PathParam("btLocator") Locator btLocator, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters")
  Response changeBuildTypeParameters(@PathParam("btLocator") Locator btLocator, @QueryParam("fields") String fields);

  @DELETE
    @Path("/{btLocator}/parameters")
  void deleteAllBuildTypeParameters(@PathParam("btLocator") Locator btLocator);

  @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters")
  Response setParameter(@PathParam("btLocator") Locator btLocator, @QueryParam("fields") String fields);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/settings")
  Response serveBuildTypeSettings(@PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/settings")
  Response replaceBuildTypeSettings(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces("text/plain")
    @Path("/{btLocator}/settings/{name}")
  Response serveBuildTypeSettings(@PathParam("btLocator") Locator btLocator, @PathParam("name") String name);

  @PUT
    @Consumes("*/*")
    @Produces("text/plain")
    @Path("/{btLocator}/settings/{name}")
  Response putBuildTypeSetting(@PathParam("btLocator") Locator btLocator, @PathParam("name") String name);

  @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/template")
  Response serveBuildTypeTemplate(@PathParam("btLocator") Locator btLocator, @QueryParam("fields") String fields);

  @PUT
    @Consumes("text/plain")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/template")
  Response getTemplateAssociation(@PathParam("btLocator") Locator btLocator, @QueryParam("fields") String fields);

  @DELETE
    @Path("/{btLocator}/template")
  void deleteTemplateAssociation(@PathParam("btLocator") Locator btLocator);

  @GET
    @Produces("text/plain")
    @Path("/{btLocator}/vcs-root-entries/{id}/checkout-rules")
  Response getVcsRootEntryCheckoutRules(@PathParam("id") String id, @PathParam("btLocator") Locator btLocator);

  @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/vcs-root-entries/{id}/checkout-rules")
  Response updateVcsRootEntryCheckoutRules(@PathParam("id") String id, @PathParam("btLocator") Locator btLocator);

}
