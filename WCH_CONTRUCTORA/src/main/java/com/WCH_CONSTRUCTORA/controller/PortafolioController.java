package com.WCH_CONSTRUCTORA.controller;

import com.WCH_CONSTRUCTORA.domain.Categoria;
import com.WCH_CONSTRUCTORA.services.CategoriaService;
import com.WCH_CONSTRUCTORA.services.FotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author natha
 */
@Controller
@RequestMapping("/portafolio")
public class PortafolioController {
    
    @Autowired
    private FotoService fotoService;
    
    @Autowired
    private CategoriaService categoriaService;
    
    
    @GetMapping("/listado/{idCategoria}")
    public String listado(Categoria categoria, Model model){
        var fotos=fotoService.getFotosPorCategoria(categoria.getIdCategoria());
        model.addAttribute("fotos",fotos);
        
        var categorias = categoriaService.getCategorias(); 

        model.addAttribute("categorias",categorias);
        
        return "/portafolio/listado";
    }
    
    @GetMapping("/listado")
    public String listado(Model model){
        var categorias = categoriaService.getCategorias(); 

        model.addAttribute("categorias",categorias);
                
                
        return "/portafolio/listado";
    }
    
    
    
}
