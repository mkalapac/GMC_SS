/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Kala
 */
@Path("/hello")
@RequestScoped
public class helloRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of helloRest
     */
    public helloRest() {
    }

    /**
     * Retrieves representation of an instance of service.helloRest
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/{param}")
    @Produces("text/plain")
    public String getText(@PathParam("param") String msg) {
        //TODO return proper representation object
        return "HelloCOffe " + msg.toLowerCase();
    }

    /**
     * PUT method for updating or creating an instance of helloRest
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
    
}
