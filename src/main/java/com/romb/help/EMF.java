/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.help;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author Mare
 */
@WebListener
public class EMF implements ServletContextListener{

    private static EntityManagerFactory emf;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        emf = Persistence.createEntityManagerFactory("com.romb_Hakaton2015_war_1.0PU");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        emf.close();
    }
    
    public static EntityManager createEntityManager(){
        if (emf == null) {
            throw new IllegalStateException("Context is not initialized yet.");
        }
        return emf.createEntityManager();
    }
}
