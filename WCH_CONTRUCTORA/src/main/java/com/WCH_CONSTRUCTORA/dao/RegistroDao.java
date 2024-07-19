
package com.WCH_CONSTRUCTORA.dao;

import com.WCH_CONSTRUCTORA.domain.Registro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RegistroDao 
        extends JpaRepository<Registro,Long>{
    
}