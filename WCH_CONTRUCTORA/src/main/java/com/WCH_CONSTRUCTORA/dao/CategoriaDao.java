
package com.WCH_CONSTRUCTORA.dao;

import com.WCH_CONSTRUCTORA.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao 
        extends JpaRepository<Categoria,Long>{
    
}
