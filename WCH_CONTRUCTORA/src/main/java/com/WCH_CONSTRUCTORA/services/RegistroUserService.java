/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.WCH_CONSTRUCTORA.services;

import com.WCH_CONSTRUCTORA.domain.Usuario;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

public interface RegistroUserService {

    public Model crearUsuario(Model model, Usuario usuario) throws MessagingException;
  
    public Model activar(Model model, String usuario, String clave);
    
    public void activar(Usuario usuario, MultipartFile imagenFile);
    
    public Model recordarUsuario(Model model, Usuario usuario) throws MessagingException;
}