
package com.WCH_CONSTRUCTORA.services;

import com.WCH_CONSTRUCTORA.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    public List<Categoria> getCategorias();
    public Categoria getCategoria(Categoria categoria);
}
