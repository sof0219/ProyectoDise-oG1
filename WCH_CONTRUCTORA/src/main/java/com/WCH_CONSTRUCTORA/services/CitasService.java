/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.WCH_CONSTRUCTORA.services;

import com.WCH_CONSTRUCTORA.domain.Citas;

import java.util.List;


public interface CitasService {
   //se obtiene los registros de la tabala citas en un arrayList
    //de objetos Citas, todos o solo los activos
    
    public List<Citas> getCtegorias(boolean activos);
    
    
    //Recupera el redisto de la tabla citas en un objeto citas
    // si el id citas existe.. sino devuelve null
    
    public Citas getCitas(Citas citas);
    
    //Actualiza un registro en la tabla citas existe
    //Crea un registro en la tabla citas si idCitas no tiene valor
    
    public void save(Citas citas);
    
    //Elimina el registro de la tabla citas si idCitas existe en la
    public void delete(Citas citas);
    
}
    
    
    
   