/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.service;

import com.romb.domain.StudentMesto;
import com.romb.domain.Ustanova;
import com.romb.exceptions.NotAuthorizedException;
import com.romb.help.Helper;
import com.romb.help.MestaUstanove;
import com.sun.jersey.api.core.InjectParam;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Mare
 */
@Path("/ustanova")
public class UstanovaRESTEndpoint {

    @InjectParam
    Helper helper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUstanove(@HeaderParam("authorization") String authorization, @QueryParam("sort") int sort) {
        EntityManager em = helper.getEntityManager();
        if (helper.isLogged(authorization, em)) {
            List<Ustanova> ustanove = em.createNamedQuery("Ustanova.findAll").getResultList();;
            List<MestaUstanove> mu = vratiUstanovu(ustanove, em);
//            if (sort != 0) {
//                return Response.ok().entity(sortirajListu(mu)).build();
//            }
            return Response.ok().entity(mu).build();
        } else {
            throw new NotAuthorizedException("Nemate pristup ovom pozivu!");
        }
    }

    public List<MestaUstanove> vratiUstanovu(List<Ustanova> lista, EntityManager em) {
        List<MestaUstanove> l = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            List<StudentMesto> mestaUstanove = em.createNamedQuery("StudentMesto.findByUstanovaId").setParameter("ustanovaId", lista.get(i).getUstanovaId()).getResultList();
            MestaUstanove mu = new MestaUstanove();
            mu.setBrojMesta(lista.get(i).getBrojMesta());
            mu.setBrojZauzetihMesta(mestaUstanove.size());
            mu.setBrojSlobodnihMesta(lista.get(i).getBrojMesta() - mestaUstanove.size());
            mu.setNazivUstanove(lista.get(i).getNaziv());
            mu.setIdUstanove(lista.get(i).getUstanovaId());
            mu.setLatitude(lista.get(i).getLatitude());
            mu.setLongitude(lista.get(i).getLongitude());
            mu.setOpis(lista.get(i).getOpis());
            l.add(mu);
        }
        return l;
    }
}
