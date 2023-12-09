package com.NoticiasEgg.EggNews.entidades;

import com.NoticiasEgg.EggNews.enumeraciones.Rol;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Admin extends Usuario {
    public Admin() {
    }

    public Admin(String id, String nombreUsuario, String password, Date fechaDeAlta, Rol rol, Boolean activo) {
        super(id, nombreUsuario, password, fechaDeAlta, rol, activo);
    }
}
