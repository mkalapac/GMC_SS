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
@Path("pozivi")
@RequestScoped
public class Pozivi {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Pozivi
     */
    public Pozivi() {
    }

    /**
     * Retrieves representation of an instance of service.Pozivi
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/{pozivParam}")
    @Produces("text/plain")
    public String getText(@PathParam("pozivParam") String msg) {
        
//        String zaprimljenPoziv = msg;
        
        //TODO proslijediti poziv dalje na ispravan kafic
        
        return msg;
    }

   
    /**
     * PUT method for updating or creating an instance of Pozivi
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
}
