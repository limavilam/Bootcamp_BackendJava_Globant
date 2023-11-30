package com.egg.biblioteca.controladores;

import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.AutorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/autor") //localhost:8080/autor
public class AutorControlador {

    @Autowired
    private AutorServicio autorServicio;


    //Se genera un método de registro
    @GetMapping("/registrar") //localhost:8080/autor/registrar
    public String registrar(){
        //Este método retorna el html que queremos que se renderice

        return "autor_form.html";
    }

    @PostMapping("/registro")
    //IMPORTANTE: El parámetro que llega a este método se llama de la misma manera que sale en autor_form
    //Linea 18 input name ="nombre"
    //Para indicarle al controlador que este es un parámetro que viaja en la URL, se marca con un @RequestParam
    //Lo que hace es indicar que es un parámetro requerido y que va a llegar cuando se ejecute el formulario
    public String registro (@RequestParam String nombre, ModelMap modelo){
        //Prueba si el método está viajando
        //System.out.println("Nombre:" + nombre);

        //Como se tiene una excepción en crearAutor debemos manejarlo con Try and Catch

        try{
            autorServicio.crearAutor(nombre);  //Esto debería ser persistido en la base de datos

            modelo.put("Exito", "El autor fue registrado correctamente");
        } catch (MiException ex){
            //Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE,null,ex);
            modelo.put("Error", ex.getMessage());
            return "autor_form.html";
        }
        return "index.html";

    }

}
