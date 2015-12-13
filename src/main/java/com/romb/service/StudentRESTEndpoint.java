/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.service;

import com.romb.help.Helper;
import com.sun.jersey.api.core.InjectParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Mare
 */
@Path("/student")
public class StudentRESTEndpoint {
    
    @InjectParam
    Helper helper;
    
    //registracija!!!
}
