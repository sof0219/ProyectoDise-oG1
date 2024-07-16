
package com.CasoPractico_1.controller;

import com.CasoPractico_1.domain.Arbol;
import com.CasoPractico_1.services.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.CasoPractico_1.services.ArbolService;

@Controller
@RequestMapping("/categoria")
public class ArbolController {
    
    @Autowired
    private ArbolService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model){
        var lista = categoriaService.getCategoria(false);
        model.addAttribute("categorias", lista);
        model.addAttribute("totalCategorias", lista.size());
        
        return "/categoria/listado";
        
    }
    @Autowired
    private FirebaseStorageService firebaseStorageService;
    
    @PostMapping("/guardar")
    public String guardar(Arbol categoria,
            @RequestParam("imagenFile") MultipartFile imagenFile) {
        
        if (!imagenFile.isEmpty()) {
            //Se sube la imagen al Storage
            categoriaService.save(categoria);
            String rutaImagen=firebaseStorageService.cargaImagen(imagenFile, 
                    "categoria", categoria.getIdArbol());
            categoria.setRutaImagen(rutaImagen);
        }
        categoriaService.save(categoria);
        return "redirect:/categoria/listado";
    }
    
    @GetMapping("/eliminar/{idArbol}")
    public String eliminar(Arbol categoria) {
        categoriaService.delete(categoria);
        return "redirect:/categoria/listado";
    }
    
    @GetMapping("/modificar/{idArbol}")
    public String modificar(Arbol categoria, Model model) {
        categoria = categoriaService.getCategoria(categoria);
        model.addAttribute("categoria", categoria);
        return "/categoria/modifica";
    }
        
}
