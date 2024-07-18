
package com.CasoPractico_1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "citas")
public class Cita implements Serializable {
    
    private static final long serialVersionUID = 11;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Cita")
    private Long idCita;
    private String nombre;
    private String apellido;
    private long numero;
    private String correo;
    private String rutaImagen;
    private boolean activo;
}
