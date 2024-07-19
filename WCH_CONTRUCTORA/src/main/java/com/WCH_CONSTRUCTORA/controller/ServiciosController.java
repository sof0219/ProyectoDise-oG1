package com.WCH_CONSTRUCTORA.controller;

import com.WCH_CONSTRUCTORA.services.CategoriaService;
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
@RequestMapping("/servicios")
public class ServiciosController {
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model){
        var categorias = categoriaService.getCategorias(); 

        model.addAttribute("categorias",categorias);

        
        return "/servicios/listado";
    }
}
