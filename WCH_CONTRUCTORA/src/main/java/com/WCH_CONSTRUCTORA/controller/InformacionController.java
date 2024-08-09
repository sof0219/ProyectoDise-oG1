package com.WCH_CONSTRUCTORA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/informacion")
public class InformacionController {

    @GetMapping("/listado")
    public String listado(Model model) {
        // Aquí podrías agregar atributos al modelo si fuera necesario
        return "/informacion/listado";
    }
}