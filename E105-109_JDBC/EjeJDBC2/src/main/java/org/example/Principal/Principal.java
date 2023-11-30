package org.example.Principal;

import org.example.Dominio.Artista.ArtistaService;

public class Principal {
    public static void main(String[] args) {

        ArtistaService artistaService = new ArtistaService();


        try {
            //Creamos  usuarios
            artistaService.crearArtista(Integer.parseInt("1"), "Shakira");
            artistaService.crearArtista(Integer.parseInt("2"), "Karol G");
            //artistaService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("1Error del sistema por \n" + e.getMessage());
        }

    }
}
