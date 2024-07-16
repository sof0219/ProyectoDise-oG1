/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CasoPractico_1.service.impl;

import com.CasoPractico_1.domain.Arbol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.CasoPractico_1.dao.ArbolDao;
import com.CasoPractico_1.services.ArbolService;

@Service
public class ArbolServiceImpl implements ArbolService {
    
    @Autowired
    private ArbolDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Arbol> getCategoria(boolean activos) {
        var lista = categoriaDao.findAll();
        
        if (activos){
            
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Arbol getCategoria(Arbol categoria) {
        return categoriaDao.findById(categoria.getIdArbol()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Arbol categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Arbol categoria) {
        categoriaDao.delete(categoria);
  
    }
    
}
