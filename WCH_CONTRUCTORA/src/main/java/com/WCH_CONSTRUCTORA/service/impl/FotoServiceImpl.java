/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WCH_CONSTRUCTORA.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.WCH_CONSTRUCTORA.services.FotoService;
import com.WCH_CONSTRUCTORA.dao.FotoDao;
import com.WCH_CONTRUCTORA.domain.Foto;

@Service
public class FotoServiceImpl implements FotoService {
    
    @Autowired
    private FotoDao fotoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Foto> getFoto() {
        var lista = fotoDao.findAll();
        

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Foto getFoto(Foto foto) {
        return fotoDao.findById(foto.getIdFoto()).orElse(null);
    }
    
}
