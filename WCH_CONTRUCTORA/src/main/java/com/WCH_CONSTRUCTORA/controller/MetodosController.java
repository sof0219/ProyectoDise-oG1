package com.WCH_CONSTRUCTORA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author XPC
 */
@Controller
@RequestMapping("/metodos")
public class MetodosController {
    
    @GetMapping("/listado")
    public String listado(Model model){
        return "/metodos/listado";
    }
    
}
