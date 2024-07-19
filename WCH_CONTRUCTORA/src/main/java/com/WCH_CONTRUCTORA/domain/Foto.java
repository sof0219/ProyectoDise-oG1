
package com.WCH_CONTRUCTORA.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "categorias")
public class Foto implements Serializable {
    
    private static final long serialVersionUID = 11;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Registro")
    private Long idFoto;
    private Long idCategoria;
    private String rutaImagen;
    
}
