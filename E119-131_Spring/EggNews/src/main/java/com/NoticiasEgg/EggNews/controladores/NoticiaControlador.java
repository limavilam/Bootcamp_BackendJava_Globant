package com.NoticiasEgg.EggNews.controladores;

import com.NoticiasEgg.EggNews.servicios.NoticiaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/noticia") //localhost:8082/noticia
public class NoticiaControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;

}


