package org.example.Persistencia;

import org.example.Dominio.Artista.Artista;

public final class ArtistaDAO extends DAO { //Nadie hereda de esta clase
    //Lo que tiene DAO me interesa que tengan todas las clases hijas.
    public void guardarArtista(Artista artista) throws Exception {
        try {
            if (artista == null) {
                throw new Exception("Debe indicar el artista");
            }

            String sql = "INSERT INTO artista (id, nombre)"
                    + "VALUES ( '" + artista.getId() + "' , '" + artista.getNombre() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}

