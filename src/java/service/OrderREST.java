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

/**
 * REST Web Service
 *
 * @author Kala
 */
@Path("order")
@RequestScoped
public class OrderREST {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of OrderREST
     */
    public OrderREST() {
    }

    /**
     * Retrieves representation of an instance of service.OrderREST
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/{orderParam}")
    @Produces("text/plain")
    public String getText(@PathParam("orderParam") String msg) {
        
        //TODO poziv s parametrima proslijediti
        return msg;
    }

    /**
     * PUT method for updating or creating an instance of OrderREST
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
}
