
package com.WCH_CONSTRUCTORA.service.impl;

import com.WCH_CONSTRUCTORA.dao.CategoriaDao;
import com.WCH_CONSTRUCTORA.domain.Categoria;
import com.WCH_CONSTRUCTORA.services.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService{
     
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategorias(){
        var lista = categoriaDao.findAll();
    
        return lista;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

}
