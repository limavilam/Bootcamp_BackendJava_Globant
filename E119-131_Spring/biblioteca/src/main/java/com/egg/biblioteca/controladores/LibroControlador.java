package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.AutorServicio;
import com.egg.biblioteca.servicios.EditorialServicio;
import com.egg.biblioteca.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/libro")
public class LibroControlador {

    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private EditorialServicio editorialServicio;

    @GetMapping("/registrar") //localhost:8080/libro/registrar
    public String registrar(ModelMap modelo) {

        //Usando ModelMap, podemos establecer el listado de autores y demás.

        List<Autor> autores = autorServicio.ListarAutores();
        List<Editorial> editoriales = editorialServicio.ListarEditoriales();

        //Se debe anclar para ser enviado a la interfaz del usuario

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);

        //Qué pasa si no enviamos nada en el registro de libros, luego el desplegable no funciona.

        return "libro_form.html";
    }

    @PostMapping("/registro")

    //Cuando queremos enviar un valor nulo de ISBN se rompe por eso usamos el required, lo mismo ocurre con ejemplares
    public String registro(@RequestParam(required = false) Long isbn, @RequestParam String titulo,
                           @RequestParam(required = false) Integer ejemplares, @RequestParam String idAutor,
                           @RequestParam String idEditorial, ModelMap modelo) {
        try {
            libroServicio.crearLibro(isbn, titulo, ejemplares, idAutor, idEditorial);

            modelo.put("Exito","El libro fue cargado correctamente!");

        } catch (MiException ex) {
            //Usando ModelMap, podemos establecer el listado de autores y demás.

            List<Autor> autores = autorServicio.ListarAutores();
            List<Editorial> editoriales = editorialServicio.ListarEditoriales();

            //Se debe anclar para ser enviado a la interfaz del usuario

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);

            //En lugar de enviarlo: Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE,null,ex);
            modelo.put("Error", ex.getMessage());
            return "libro_form.html";  // volvemos a cargar el formulario.
        }
        return "index.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        List<Libro> libros =libroServicio.ListarLibros();

        modelo.addAttribute("libros",libros);

        return "libro_list.html";
    }

    @GetMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, ModelMap modelo) {

        modelo.put("libro", libroServicio.getOne(isbn));

        List<Autor> autores = autorServicio.ListarAutores();
        List<Editorial> editoriales = editorialServicio.ListarEditoriales();

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);

        return "libro_modificar.html";
    }

    @PostMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial, ModelMap modelo) {
        try {
            List<Autor> autores = autorServicio.ListarAutores();
            List<Editorial> editoriales = editorialServicio.ListarEditoriales();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);

            libroServicio.modificarLibro(isbn, titulo, ejemplares, idAutor, idEditorial);


            return "redirect:../lista";

        } catch (MiException ex) {
            List<Autor> autores = autorServicio.ListarAutores();
            List<Editorial> editoriales = editorialServicio.ListarEditoriales();

            modelo.put("error", ex.getMessage());

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);

            return "libro_modificar.html";
        }

    }

}
