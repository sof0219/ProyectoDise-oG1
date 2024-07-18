
package com.WCH_CONTRUCTORA.controller;

import com.WCH_CONTRUCTORA.domain.Registro;
import com.WCH_CONTRUCTORA.services.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.WCH_CONTRUCTORA.services.RegistroService;

@Controller
@RequestMapping("/registro")
public class RegistoController {
    
    @Autowired
    private RegistroService registroService;
    
    @GetMapping("/listado")
    public String listado(Model model){
        var lista = registroService.getRegistro(false);
        model.addAttribute("registros", lista);
        model.addAttribute("totalRegistros", lista.size());
        
        return "/registro/listado";
        
    }
}    