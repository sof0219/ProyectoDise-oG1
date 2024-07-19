/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WCH_CONSTRUCTORA.service.impl;

import com.WCH_CONSTRUCTORA.domain.Registro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.WCH_CONSTRUCTORA.dao.RegistroDao;
import com.WCH_CONSTRUCTORA.services.RegistroService;

@Service
public class RegistroServiceImpl implements RegistroService {
    
    @Autowired
    private RegistroDao registroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Registro> getRegistro(boolean activos) {
        var lista = registroDao.findAll();
        
        if (activos){
            
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Registro getRegistro(Registro registro) {
        return registroDao.findById(registro.getIdRegistro()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Registro registro) {
        registroDao.save(registro);
    }

    @Override
    @Transactional
    public void delete(Registro registro) {
        registroDao.delete(registro);
  
    }
    
}
