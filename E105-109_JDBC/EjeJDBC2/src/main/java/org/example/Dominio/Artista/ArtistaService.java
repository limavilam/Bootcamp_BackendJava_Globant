package org.example.Dominio.Artista;

import org.example.Persistencia.ArtistaDAO;

import java.util.Collection;

public class ArtistaService {
    private ArtistaDAO dao;

    public ArtistaService() {
        this.dao = new ArtistaDAO();
    }

    public void crearArtista(int idArtista, String nombre) throws Exception {

        try {
            //Validamos
            try {
                // Validamos el campo nombre
                if (nombre == null || nombre.isEmpty()) {
                    throw new Exception("Debe indicar el nombre del artista");
                }
                //Creamos el artista
                Artista artista = new Artista();
                artista.setId(idArtista);
                artista.setNombre(nombre);
                dao.guardarArtista(artista);

            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public Collection<Artista> listarArtista() throws Exception {
//
//        try {
//
//            Collection<Artista> artistas = dao.listarArtista();
//
//            return artistas;
//        } catch (Exception e) {
//            throw e;
//        }
//    }

//    public void imprimirUsuarios() throws Exception {
//
//        try {
//
//            //Listamos los usuarios
//            Collection<Artista> artistas = listarArtista();
//
//            //Imprimimos los usuarios
//            if (artistas.isEmpty()) {
//                throw new Exception("No existen usuarios para imprimir");
//            } else {
//                for (Artista a : artistas) {
//                    System.out.println(a);
//                }
//            }
//        } catch (Exception e) {
//            throw e;

    }

