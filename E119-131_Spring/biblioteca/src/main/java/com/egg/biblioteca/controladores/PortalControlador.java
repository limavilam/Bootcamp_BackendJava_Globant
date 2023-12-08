package com.egg.biblioteca.controladores;

import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/")
//Esta nos configura cuál es la URL que va a escuchar a ese controlador, en este ejemplo indicamos que es la /
public class PortalControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/")
    public String index(){

        //Vamos a devolver la vista que queremos que se renderice una vez que se ingresa a la barrita (/).
        return "index.html";

    }

    @GetMapping("/registrar")
    public String Registrar(){

        //Vamos a devolver la vista que queremos que se renderice una vez que se ingresa a la barrita (/).
        return "registro.html";

    }

    //Creamos el método que va a recibir todos los valores que arroja el formulario
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, @RequestParam String email,
                           @RequestParam String password, String password2, ModelMap modelo){

        //Llamamos al método registrar que tenemos en el servicio para eso generamos una instancia única del usuario
        // servicio @Autowired private UsuarioServicio usuarioServicio;
        //Haciendo uso de lo anterior podemos ingresar al método registrar

        try {
            usuarioServicio.registrar(nombre, email, password, password2);
            modelo.put("Exito", "Usuario registrado correctamente!");
            return "index.html";
        } catch (MiException ex) {
            //Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE,null,ex);
            modelo.put("Error",ex.getMessage());
            //Cuanda haya un error de carga de información con la siguiente línea permite que se guarden
            modelo.put("nombre",nombre);
            modelo.put("email",email);

            //Para que la contraseña no sea simple.

            return "registro.html";
        }
    }

    @GetMapping("/login")
    public String Login(@RequestParam(required = false) String error, ModelMap modelo){

        if (error != null){
            modelo.put("Error", "Usuario o Contraseña invalidos");
        }
        //Vamos a devolver la vista que queremos que se renderice una vez que se ingresa a la barrita (/).
        return "login.html";
    }

    //Autorice el acceso a este método bajo determinadas reglas
    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String inicio(){
        return "inicio.html";
    }


}
