
package com.WCH_CONSTRUCTORA.dao;

import com.WCH_CONSTRUCTORA.domain.Foto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FotoDao 
        extends JpaRepository<Foto,Long>{
    
}