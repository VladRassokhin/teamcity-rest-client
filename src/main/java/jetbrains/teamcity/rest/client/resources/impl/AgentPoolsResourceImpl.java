/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.AgentPoolsResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class AgentPoolsResourceImpl extends ResourceImpl implements AgentPoolsResource{


    public AgentPoolsResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response getPools() {
        //TODO: implement
        return null;
    }


    public Response setPools() {
        //TODO: implement
        return null;
    }


    public Response addProject(String agentPoolLocator) {
        //TODO: implement
        return null;
    }


    public Response getPoolProjects(String agentPoolLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response replaceProjects(String agentPoolLocator) {
        //TODO: implement
        return null;
    }


    public Response getPoolAgents(String agentPoolLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response addAgent(String agentPoolLocator) {
        //TODO: implement
        return null;
    }


    public void deletePool(String agentPoolLocator) {
        //TODO: implement
    }


    public Response getPool(String agentPoolLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getPoolProject(String projectLocator, String agentPoolLocator, String fields) {
        //TODO: implement
        return null;
    }


    public void deletePoolProject(String projectLocator, String agentPoolLocator) {
        //TODO: implement
    }

}
