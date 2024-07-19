package com.WCH_CONSTRUCTORA.services;

import com.WCH_CONSTRUCTORA.domain.Cita;
import java.util.List;

public interface CitaService {
    public List<Cita> getCita(boolean activos);
    
    
    //Recupera el redisto de la tabla cita en un objeto cita
    // si el id cita existe.. sino devuelve null
    
    public Cita getCita(Cita cita);
    
    //Actualiza un cita en la tabla cita existe
    //Crea un cita en la tabla cita si idCita no tiene valor
    
    public void save(Cita cita);
    
    //Elimina el cita de la tabla cita si idCita existe en la
    public void delete(Cita cita);
    
} 

