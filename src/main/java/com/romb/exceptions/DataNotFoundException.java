/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.exceptions;

import javax.ws.rs.core.Response;

/**
 *
 * @author Mare
 */
public class DataNotFoundException extends CMSException {
    
    public DataNotFoundException (String message){
        super(message, 404, Response.Status.NOT_FOUND);
    }
    
    
}
