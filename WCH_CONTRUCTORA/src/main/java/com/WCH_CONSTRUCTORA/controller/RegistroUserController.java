
package com.WCH_CONSTRUCTORA.controller;

import com.WCH_CONSTRUCTORA.domain.Usuario;
import com.WCH_CONSTRUCTORA.services.RegistroUserService;
import jakarta.mail.MessagingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/registroUser")
public class RegistroUserController {

    @Autowired
    private RegistroUserService registroUserService;

    @GetMapping("/nuevo")
    public String nuevo(Model model, Usuario usuario) {
        return "/registroUser/nuevo";
    }

    @GetMapping("/recordar")
    public String recordar(Model model, Usuario usuario) {
        return "/registroUser/recordar";
    }

    @PostMapping("/crearUsuario")
    public String crearUsuario(Model model, Usuario usuario) 
            throws MessagingException {
        model = registroUserService.crearUsuario(model, usuario);
        return "/registroUser/salida";
    }

    @GetMapping("/activacion/{usuario}/{id}")
    public String activar(
            Model model, 
            @PathVariable(value = "usuario") String usuario, 
            @PathVariable(value = "id") String id) {
        model = registroUserService.activar(model, usuario, id);
        if (model.containsAttribute("usuario")) {
            return "/registroUser/activa";
        } else {
            return "/registroUser/salida";
        }
    }

    @PostMapping("/activar")
    public String activar(
            Usuario usuario, 
            @RequestParam("imagenFile") MultipartFile imagenFile) {
        registroUserService.activar(usuario, imagenFile);
        return "redirect:/";
    }

    @PostMapping("/recordarUsuario")
    public String recordarUsuario(Model model, Usuario usuario) 
            throws MessagingException {
        model = registroUserService.recordarUsuario(model, usuario);
        return "/registroUser/salida";
    }
}