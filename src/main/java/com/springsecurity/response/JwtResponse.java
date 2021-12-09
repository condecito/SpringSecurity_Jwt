/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springsecurity.response;

import java.util.List;

/**
 *
 * @author ronya
 */
public class JwtResponse {

    private String token;
    private String Type;
    private Long id;
    private String username;
    private List<String> roles;

    public JwtResponse(String jwt, Long userid, String username, List<String> roles) {
        this.token = jwt;
        this.username = username;
        this.id=userid;
        this.roles = roles;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

}
