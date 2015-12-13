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
public class NotAuthorizedException extends CMSException {

    /**
     * 
     * @param message - message to send
     */
    public NotAuthorizedException(String message) {
        super(message, 401, Response.Status.UNAUTHORIZED);
    }
}