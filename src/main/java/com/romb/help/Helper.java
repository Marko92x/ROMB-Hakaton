/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.help;

import com.romb.domain.Student;
import com.romb.domain.StudentMesto;
import com.romb.exceptions.DataNotFoundException;
import javax.persistence.EntityManager;

/**
 *
 * @author Mare
 */
public class Helper {
    
    AbstractTokenCreator tokenHelper;

    public Helper() {
        tokenHelper = new Base64Token();
    }
    
    public AbstractTokenCreator getAbstractToken() {
        return tokenHelper;
    }
    
    public EntityManager getEntityManager() {
        return EMF.createEntityManager();
    }
    
    public boolean isLogged(String token, EntityManager em) {
        try {
            String[] userPass = getAbstractToken().decode(token).split("##");
            Student ar = em.find(Student.class, Long.parseLong(userPass[1]));
            return ar.getToken() != null;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void persistObject(EntityManager em, Object o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
    }

    public void removeObject(EntityManager em, Object o) {
        
        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
    }

    public void mergeObject(EntityManager em, Object o) {
        em.getTransaction().begin();
        em.merge(o);
        em.getTransaction().commit();
    }
}
