/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CasoPractico_1.services;

import com.CasoPractico_1.domain.Arbol;
import java.util.List;

/**
 *
 * @author migue
 */
public interface ArbolService {
   //se obtiene los registros de la tabala categoria en un arrayList
    //de objetos Categoria, todos o solo los activos
    
    public List<Arbol> getCategoria(boolean activos);
    
    
    //Recupera el redisto de la tabla categoria en un objeto categoria
    // si el id categoria existe.. sino devuelve null
    
    public Arbol getCategoria(Arbol categoria);
    
    //Actualiza un registro en la tabla categoria existe
    //Crea un registro en la tabla categoria si idCategoria no tiene valor
    
    public void save(Arbol categoria);
    
    //Elimina el registro de la tabla categoria si idCategoria existe en la
    public void delete(Arbol categoria);
    
} 

