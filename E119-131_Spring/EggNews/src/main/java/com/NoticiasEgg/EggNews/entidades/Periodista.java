package com.NoticiasEgg.EggNews.entidades;

import com.NoticiasEgg.EggNews.enumeraciones.Rol;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Periodista extends Usuario{
    @OneToMany
    private List<Noticia> misNoticias;
    private Integer sueldoMensual;


    public Periodista() {
    }

    public Periodista(String id, String nombreUsuario, String password, Date fechaDeAlta, Rol rol, Boolean activo, List<Noticia> misNoticias) {
        super(id,nombreUsuario, password, fechaDeAlta, rol, activo);
        this.misNoticias = misNoticias;
        this.sueldoMensual = sueldoMensual;
    }

    public List<Noticia> getMisNoticias() {
        return misNoticias;
    }

    public void setMisNoticias(List<Noticia> misNoticias) {
        this.misNoticias = misNoticias;
    }

    public Integer getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Integer sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
