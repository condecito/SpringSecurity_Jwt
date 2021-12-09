/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springsecurity.response;

/**
 *
 * @author ronya
 */
public class MessageResponse {
    private String message;

    public MessageResponse(String error_Username_is_already_taken) {
        this.message=error_Username_is_already_taken;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
    
}
