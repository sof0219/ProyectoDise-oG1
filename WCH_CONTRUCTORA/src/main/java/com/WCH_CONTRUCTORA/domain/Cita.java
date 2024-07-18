
package com.WCH_CONTRUCTORA.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "cita")
public class Cita implements Serializable {
    
    private static final long serialVersionUID = 11;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Long idCita;
    private String nombre;
    private String apellido;
    private long numero;
    private String correo;
    private String rutaImagen;
    private boolean activo;
}
