package com.NoticiasEgg.EggNews.excepciones;

public class MiException extends Exception{

    //Generamos esta clase para diferenciar los errores
    // que tengamos en la lógica del negocio de los errores propios del sistema.
    public MiException(String msg){
        super(msg);
    }
}
