/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.service;

import com.romb.domain.Mesto;
import com.romb.domain.MestoPK;
import com.romb.domain.Student;
import com.romb.domain.StudentMesto;
import com.romb.domain.StudentMestoPK;
import com.romb.domain.Ustanova;
import com.romb.exceptions.NotAuthorizedException;
import com.romb.help.Helper;
import com.romb.help.MestaUstanove;
import com.sun.jersey.api.core.InjectParam;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Mare
 */
@Path("/student_mesto")
public class Student_MestoRESTEndpoint {

    @InjectParam
    Helper helper;

    @GET
    @Path("{ustanovaId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMestaUstanove(@HeaderParam("authorization") String authorization, @PathParam("ustanovaId") long ustanovaId) {
        EntityManager em = helper.getEntityManager();
        if (helper.isLogged(authorization, em)) {
            List<StudentMesto> mestaUstanove = em.createNamedQuery("StudentMesto.findByUstanovaId").setParameter("ustanovaId", ustanovaId).getResultList();
            Ustanova ustanova = (Ustanova) em.createNamedQuery("Ustanova.findByUstanovaId").setParameter("ustanovaId", ustanovaId).getSingleResult();
            int brojMesta = ustanova.getBrojMesta();
            MestaUstanove mu = new MestaUstanove();
            mu.setBrojMesta(brojMesta);
            mu.setBrojZauzetihMesta(mestaUstanove.size());
            mu.setBrojSlobodnihMesta(brojMesta - mestaUstanove.size());
            mu.setNazivUstanove(ustanova.getNaziv());
            mu.setIdUstanove(ustanova.getUstanovaId());
            mu.setLatitude(ustanova.getLatitude());
            mu.setLongitude(ustanova.getLongitude());
            mu.setOpis(ustanova.getOpis());
            return Response.ok().entity(mu).build();
        } else {
            throw new NotAuthorizedException("Nemate pristup ovom pozivu!");
        }
    }

    @GET
    @Path("{idUstanove}/{idMesta}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response importZauzeto(@HeaderParam("authorization") String authorization, @PathParam("idUstanove") long idUstanove, @PathParam("idMesta") long idMesta) {
        EntityManager em = helper.getEntityManager();
        if (helper.isLogged(authorization, em)) {
            try {
                Mesto m = new Mesto();
                m.setMestoPK(new MestoPK(idMesta, idUstanove));
                m.setRezervacija(true);
                helper.mergeObject(em, m);
                StudentMesto sm = new StudentMesto();
                sm.setStudentMestoPK(new StudentMestoPK(Long.parseLong(helper.getAbstractToken().decode(authorization).split("##")[1]), idMesta, idUstanove));
                int randomNumber = new Random().nextInt(9000) + 1000;
                sm.setPin(randomNumber + "");
                helper.persistObject(em, sm);
                return Response.ok().entity(randomNumber + "").build();
            } catch (Exception e) {
                return Response.ok().entity("Uspesno!").build();
            }
        } else {
            throw new NotAuthorizedException("Nemate pristup ovom pozivu!");
        }
    }

    @GET
    @Path("/out")
    @Produces(MediaType.APPLICATION_JSON)
    public Response chechOut(@HeaderParam("authorization") String authorization) {
        EntityManager em = helper.getEntityManager();
        if (helper.isLogged(authorization, em)) {
            Student s = em.find(Student.class, Long.parseLong(helper.getAbstractToken().decode(authorization).split("##")[1]));
            s.setPoeni(s.getPoeni() + 10);
            helper.mergeObject(em, s);
            StudentMesto sm = (StudentMesto) em.createNamedQuery("StudentMesto.findByStudentId").setParameter("studentId", s.getStudentId()).getSingleResult();
            helper.removeObject(em, sm);
            Mesto m = sm.getMesto();
            m.setRezervacija(false);
            helper.mergeObject(em, m);
            return Response.ok().build();
        } else {
            throw new NotAuthorizedException("Nemate pristup ovom pozivu!");
        }
    }
    
    @GET
    @Path("/pin/{pin}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response odjaviKolegu(@HeaderParam("authorization") String authorization, @PathParam("pin") String pin){
        EntityManager em = helper.getEntityManager();
        if (helper.isLogged(authorization, em)) {
            StudentMesto sm = (StudentMesto) em.createNamedQuery("StudentMesto.findByPin").setParameter("pin", pin).getSingleResult();
            em.remove(sm);
            Student s = em.find(Student.class, Long.parseLong(helper.getAbstractToken().decode(authorization).split("##")[1]));
            s.setPoeni(s.getPoeni() + 5);
            helper.mergeObject(em, s);
            Mesto m = sm.getMesto();
            m.setRezervacija(false);
            helper.mergeObject(em, m);
            return Response.ok().build();
        } else {
            throw new NotAuthorizedException("Nemate pristup ovom pozivu!");
        }
    }
}
