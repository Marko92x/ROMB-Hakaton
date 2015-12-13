/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Mare
 */
public abstract class CMSException extends WebApplicationException {

    public CMSException(String message, int code, Response.Status status) {
        super(Response.status(status).entity(new ErrorMessage(message, code)).type(MediaType.APPLICATION_JSON).build());
    }

}
