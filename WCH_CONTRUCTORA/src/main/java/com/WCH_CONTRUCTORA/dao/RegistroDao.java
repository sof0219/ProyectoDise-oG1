
package com.WCH_CONTRUCTORA.dao;

import com.WCH_CONTRUCTORA.domain.Registro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RegistroDao 
        extends JpaRepository<Registro,Long>{
    
}