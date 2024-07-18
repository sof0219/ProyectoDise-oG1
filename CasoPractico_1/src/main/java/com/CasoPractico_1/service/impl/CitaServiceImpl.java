/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CasoPractico_1.service.impl;

import com.CasoPractico_1.domain.Cita;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.CasoPractico_1.services.CitaService;
import com.CasoPractico_1.dao.CitaDao;

@Service
public class CitaServiceImpl implements CitaService {
    
    @Autowired
    private CitaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cita> getCategoria(boolean activos) {
        var lista = categoriaDao.findAll();
        
        if (activos){
            
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Cita getCategoria(Cita categoria) {
        return categoriaDao.findById(categoria.getIdCita()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cita categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Cita categoria) {
        categoriaDao.delete(categoria);
  
    }
    
}
