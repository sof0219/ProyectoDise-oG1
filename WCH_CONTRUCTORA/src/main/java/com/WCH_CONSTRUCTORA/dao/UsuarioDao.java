/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WCH_CONSTRUCTORA.dao;

import com.WCH_CONSTRUCTORA.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface UsuarioDao
        extends JpaRepository<Usuario, Long> {
    
    public Usuario findByUsername(String username);

    public Usuario findByUsernameAndPassword(String username, String Password);

    public Usuario findByUsernameOrCorreo(String username, String correo);

    public boolean existsByUsernameOrCorreo(String username, String correo);
}
