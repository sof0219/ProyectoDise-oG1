/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.WCH_CONSTRUCTORA.services;

import com.WCH_CONSTRUCTORA.domain.Foto;
import java.util.List;

/**
 *
 * @author migue
 */
public interface FotoService {
   //se obtiene los fotos de la tabala foto en un arrayList
    //de objetos Foto, todos o solo los activos
    
    public List<Foto> getFoto();
    
    
    //Recupera el redisto de la tabla foto en un objeto foto
    // si el id foto existe.. sino devuelve null
    
    public Foto getFoto(Foto foto);
    
    //Actualiza un foto en la tabla foto existe
    //Crea un foto en la tabla foto si idFoto no tiene valor
    
    public List<Foto> getFotosPorCategoria(long idCategoria);
    
} 

