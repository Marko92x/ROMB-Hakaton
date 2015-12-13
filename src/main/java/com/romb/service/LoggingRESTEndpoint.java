/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.service;

import com.romb.domain.Student;
import com.romb.exceptions.BasicAuthenticationException;
import com.romb.help.AbstractTokenCreator;
import com.romb.help.Helper;
import com.romb.help.JsonToken;
import com.sun.jersey.api.core.InjectParam;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Mare
 */
@Path("authorization")
public class LoggingRESTEndpoint {
    
    Helper helper;
    AbstractTokenCreator tokenHelper;

    public LoggingRESTEndpoint() {
        helper = new Helper();
        tokenHelper = helper.getAbstractToken();
    }
    
    @GET
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(@HeaderParam("authorization") String authorization){
        try{
            String[] userPass = tokenHelper.decodeBasicAuth(authorization);
            EntityManager em = helper.getEntityManager();
            Student ar = (Student) em
                    .createQuery("SELECT ar FROM Student ar WHERE ar.email = :email AND ar.password = :password")
                    .setParameter("email", userPass[0])
                    .setParameter("password", userPass[1])
                    .getSingleResult();
            
            if (ar.getToken() == null || ar.getToken().equals("")){
                ar.setToken(tokenHelper.createToken(ar.getStudentId()));
                helper.mergeObject(em, ar);
            }
            JsonToken jsonToken = new JsonToken(tokenHelper.encode(ar.getToken()));
            return Response.ok().entity(jsonToken).build();
        } catch (RuntimeException e){
            throw new BasicAuthenticationException(e.getMessage());
        }
    }
    
    @GET
    @Path("/logout")
    @Produces(MediaType.APPLICATION_JSON)
    public Response logout(@HeaderParam("authorization") String authorization){
        EntityManager em = helper.getEntityManager();
        Student ar = em.find(Student.class, Long.parseLong(tokenHelper.decode(authorization).split("##")[1]));
        if (ar != null){
            ar.setToken(null);
            return Response.ok("Uspesno ste se izlogovali!").build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}
