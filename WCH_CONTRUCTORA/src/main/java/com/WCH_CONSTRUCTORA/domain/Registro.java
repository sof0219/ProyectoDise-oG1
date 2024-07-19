
package com.WCH_CONSTRUCTORA.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "registro")
public class Registro implements Serializable {
    
    private static final long serialVersionUID = 11;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Registro")
    private Long idRegistro;
    private String nombre;
    private String apellido;
    private long numero;
    private String correo;
    private String contraseña;
    private boolean activo;
}
