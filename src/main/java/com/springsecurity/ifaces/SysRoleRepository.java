/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springsecurity.ifaces;

import com.springsecurity.entity.SysRole;
import com.springsecurity.utils.ERole;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ronya
 */
@Repository
public interface SysRoleRepository extends JpaRepository<SysRole, Integer>{
    Optional<SysRole> findByname(ERole name);
}
