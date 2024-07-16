
package com.CasoPractico_1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable {
    
    private static final long serialVersionUID = 11;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Arbol")
    private Long idArbol;
    private String nombreArbol;
    private String tipoFlor;
    private String durezaMadera;
    private Long alturaArbol;
    private String rutaImagen;
    private boolean activo;
}
