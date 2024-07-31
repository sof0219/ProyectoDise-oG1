/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WCH_CONSTRUCTORA.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="citas")
public class Citas implements Serializable {
    
    private static final long serialVersionUID= 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_cita")
    private Long idCita;
    
    private String nombre;
    private String apellido;
     private String correo;
    private int telefono;
    private boolean activo;
    
     @OneToMany
    @JoinColumn(name="id_cita", updatable=false)
    private List<Citas> citas;
}

