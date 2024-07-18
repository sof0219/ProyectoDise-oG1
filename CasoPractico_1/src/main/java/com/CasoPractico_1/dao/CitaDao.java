
package com.CasoPractico_1.dao;

import com.CasoPractico_1.domain.Cita;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CitaDao 
        extends JpaRepository<Cita,Long>{
    
}