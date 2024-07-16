
package com.CasoPractico_1.dao;

import com.CasoPractico_1.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArbolDao 
        extends JpaRepository<Arbol,Long>{
    
}