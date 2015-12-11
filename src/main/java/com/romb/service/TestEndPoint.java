/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.service;

import com.romb.test.Test;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Mare
 */
@Path("/test")
public class TestEndPoint {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTest(){
        Test t = new Test();
        t.setId(1);
        t.setName("Test!");
        return Response.ok().entity(t).build();
    }
}
