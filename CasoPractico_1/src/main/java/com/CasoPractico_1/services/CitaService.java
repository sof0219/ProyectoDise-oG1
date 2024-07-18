/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CasoPractico_1.services;

import com.CasoPractico_1.domain.Cita;
import java.util.List;

/**
 *
 * @author migue
 */
public interface CitaService {
   //se obtiene los registros de la tabala cita en un arrayList
    //de objetos Cita, todos o solo los activos
    
    public List<Cita> getCita(boolean activos);
    
    
    //Recupera el redisto de la tabla cita en un objeto cita
    // si el id cita existe.. sino devuelve null
    
    public Cita getCita(Cita cita);
    
    //Actualiza un registro en la tabla cita existe
    //Crea un registro en la tabla cita si idCita no tiene valor
    
    public void save(Cita cita);
    
    //Elimina el registro de la tabla cita si idCita existe en la
    public void delete(Cita cita);
    
} 

