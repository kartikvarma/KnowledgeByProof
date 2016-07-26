package org.kartik.kbp.demo.webservice;


import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by kartikbvarma on 6/8/16.
 */
@Path("/Rest")
public interface IDemoRestService {

    @GET
    @Path("/caloriesPerDay/{weight}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response caloriesPerDay(@Context HttpHeaders header, @PathParam("weight")double weight) throws Exception;

}