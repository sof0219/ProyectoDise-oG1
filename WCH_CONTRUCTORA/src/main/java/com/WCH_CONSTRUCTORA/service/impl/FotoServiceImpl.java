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
import com.WCH_CONSTRUCTORA.domain.Foto;

@Service
public class FotoServiceImpl implements FotoService {
    
    @Autowired
    private FotoDao FotoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Foto> getFoto() {
        var lista = FotoDao.findAll();
        

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Foto getFoto(Foto foto) {
        return FotoDao.findById(foto.getIdFoto()).orElse(null);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Foto> getFotosPorCategoria(long idCategoria){
        return FotoDao.findByIdCategoria(idCategoria);
    }
    
}
