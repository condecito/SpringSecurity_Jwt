/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springsecurity.repository;

import com.springsecurity.ifaces.SysUserRepository;
import com.springsecurity.entity.SysUser;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ronya
 */
@Service
public class CustomUserService implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(CustomUserService.class);

    @Autowired          
    SysUserRepository sysuserRepository;

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = sysuserRepository.findByUsername(username).
                orElseThrow(() -> new UsernameNotFoundException("USR:001 El usuario especificado no se encuentra activo:"));

        //if(user==null)
        //  throw new UsernameNotFoundException("USR:001 El usuario especificado no se encuentra activo:");
        log.info("input:username=" + username);
        log.info("out:username=" + user.getusername());
        return UserDetailsImpl.build(user);
    }

 
}
