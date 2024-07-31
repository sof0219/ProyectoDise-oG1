/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WCH_CONSTRUCTORA.dao;

import com.WCH_CONSTRUCTORA.domain.Citas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface CitasDao
        extends JpaRepository<Citas, Long> {

}
