/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.service;

import com.romb.domain.Mesto;
import com.romb.help.EMF;
import com.romb.help.Helper;
import com.romb.test.Test;
import com.sun.jersey.api.core.InjectParam;
import java.util.List;
import javax.persistence.EntityManager;
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
    
    @InjectParam
    Helper helper;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTest(){
        EntityManager em = helper.getEntityManager();
        List<Mesto> lista = em.createNamedQuery("Mesto.findAll").getResultList();
        return Response.ok().entity("Bleki sisa!").build();
    }
}
