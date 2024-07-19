
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
    @Column(name = "id_cliente")
    private Long idCliente;
    private String nombre;
    private String apellido;
    private long telefono;
    private String correo;
    private String password;
    private boolean activo;
}
