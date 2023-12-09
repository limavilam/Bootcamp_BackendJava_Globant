package com.NoticiasEgg.EggNews.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalControlador {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String inicio(){
        return "inicio.html";
    }
}
