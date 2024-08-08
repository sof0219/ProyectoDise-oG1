/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WCH_CONSTRUCTORA.dao;

import com.WCH_CONSTRUCTORA.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface RolDao
        extends JpaRepository<Rol, Long> {
    
    
    }
