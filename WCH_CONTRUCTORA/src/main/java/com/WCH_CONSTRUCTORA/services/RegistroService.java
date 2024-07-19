/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.WCH_CONSTRUCTORA.services;

import com.WCH_CONSTRUCTORA.domain.Registro;
import java.util.List;

/**
 *
 * @author migue
 */
public interface RegistroService {
   //se obtiene los registros de la tabala registro en un arrayList
    //de objetos Registro, todos o solo los activos
    
    public List<Registro> getRegistro(boolean activos);
    
    
    //Recupera el redisto de la tabla registro en un objeto registro
    // si el id registro existe.. sino devuelve null
    
    public Registro getRegistro(Registro registro);
    
    //Actualiza un registro en la tabla registro existe
    //Crea un registro en la tabla registro si idRegistro no tiene valor
    
    public void save(Registro registro);
    
    //Elimina el registro de la tabla registro si idRegistro existe en la
    public void delete(Registro registro);
    
} 

