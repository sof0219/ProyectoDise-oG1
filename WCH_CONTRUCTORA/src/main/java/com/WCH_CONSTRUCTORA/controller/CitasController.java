/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WCH_CONSTRUCTORA.controller;


import com.WCH_CONSTRUCTORA.domain.Citas;
import com.WCH_CONSTRUCTORA.services.CitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/citas")
public class CitasController {
    
    @Autowired
    private CitasService citasService;
    
    
    @GetMapping("/listado")
    public String listado(Model model) {
        var lista=citasService.getCtegorias(false);
        model.addAttribute("citass", lista);
        model.addAttribute("totalCitass", lista.size());
        
        return "/citas/listado";
    }
    
    
    
    @PostMapping("/guardar")
    public String guardar(Citas citas){
        citasService.save(citas);
        return "redirect:/citas/listado";
    }
    
    @GetMapping("/eliminar/{idCitas}")
    public String eliminar(Citas citas) {
        citasService.delete(citas);
        return "redirect:/citas/listado";
    }
    
    @GetMapping("/modificar/{idCitas}")
    public String modificar(Citas citas, Model model) {
        citas = citasService.getCitas(citas);
        model.addAttribute("citas", citas);
        
        return "/citas/modifica";
    }
    
    
}
