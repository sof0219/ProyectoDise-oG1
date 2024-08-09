package com.WCH_CONSTRUCTORA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")
public class ContactoController {
      
    @GetMapping("/listado")
    public String listado(Model model){
        System.out.println("Pruebaaaaaa");
        return "/contacto/listado";
    }
    
}
