/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WCH_CONSTRUCTORA.service.impl;


import com.WCH_CONSTRUCTORA.dao.CitasDao;
import com.WCH_CONSTRUCTORA.domain.Citas;
import com.WCH_CONSTRUCTORA.services.CitasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CitasServiceImpl implements CitasService {
    
    @Autowired
    private CitasDao citasDao;

    @Override
    @Transactional(readOnly = true)
    public List<Citas> getCtegorias(boolean activos) {
        var lista = citasDao.findAll();
        
        if (activos){
            
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Citas getCitas(Citas citas) {
        return citasDao.findById(citas.getIdCita()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Citas citas) {
        citasDao.save(citas);
    }

    @Override
    @Transactional
    public void delete(Citas citas) {
        citasDao.delete(citas);
  
    }
    
}
