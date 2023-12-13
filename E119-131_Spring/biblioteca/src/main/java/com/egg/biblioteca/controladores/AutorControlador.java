package com.egg.biblioteca.controladores;

import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.AutorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.egg.biblioteca.entidades.Autor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        List<Autor> autores =autorServicio.ListarAutores();

        modelo.addAttribute("autores",autores);

        return "autor_list.html";
    }
    //¿Cuál es al autor que debe modificar?, para ello se usa path variable.

    //Le estamos diciendo a spring que String id es una variable de path
    // y va a viajar en esa URL "/modificar/{id}"
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo){

        //La idea es que aparezcan los datos precargados o propios del autor seleccionado.
        modelo.put("autor",autorServicio.getOne(id));

        return "autor_modificar.html";

    }

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String nombre, ModelMap modelo){

        try{
            autorServicio.modificarAutor(nombre,id);

            return "redirect:../lista";
        }catch (MiException ex){
            modelo.put("Error",ex.getMessage());

            return "autor_modificar.html";
        }

    }
}
