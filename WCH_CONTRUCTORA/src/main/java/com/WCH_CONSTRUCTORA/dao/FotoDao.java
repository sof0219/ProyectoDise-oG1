
package com.WCH_CONSTRUCTORA.dao;

import com.WCH_CONSTRUCTORA.domain.Foto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FotoDao 
        extends JpaRepository<Foto,Long>{
    
    public List<Foto> findByIdCategoria(long idCategoria);
    
}