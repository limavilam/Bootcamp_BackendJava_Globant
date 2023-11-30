package com.egg.biblioteca.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
//Esta nos configura cuál es la URL que va a escuchar a ese controlador, en este ejemplo indicamos que es la /
public class PortalControlador {

    @GetMapping("/")
    public String index(){

        //Vamos a devolver la vista que queremos que se renderice una vez que se ingresa a la barrita (/).
        return "index.html";

    }


}
