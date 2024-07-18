
package com.CasoPractico_1.controller;

import com.CasoPractico_1.domain.Cita;
import com.CasoPractico_1.services.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.CasoPractico_1.services.CitaService;

@Controller
@RequestMapping("/cita")
public class CitaController {
    
    @Autowired
    private CitaService citaService;
    
    @GetMapping("/listado")
    public String listado(Model model){
        var lista = citaService.getCita(false);
        model.addAttribute("citas", lista);
        model.addAttribute("totalCitas", lista.size());
        
        return "/cita/listado";
        
    }
}    