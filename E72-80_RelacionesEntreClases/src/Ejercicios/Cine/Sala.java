package Ejercicios.Cine;

public class Sala {

    //El servicio de la sala es ubicar un espectador una columna.

    private Pelicula pelicula;
    private Asiento[][] asientos = new Asiento[8][6];

    public Sala(Pelicula pelicula) {
        this.pelicula = pelicula;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; i < asientos[i].length; j++) {
                asientos[i][j] = new Asiento(); //Me encargo de crear el nuevo asiento.
            }
        }
    }

    /*
    filas: 1-8
    columnas: A-F
     */

    private int convertirFila(char fila) {
        return fila - '1';
    }

    private int convertirColumna(char columna) {
        return columna - 'A';
    }

    public boolean ubicar(Espectador espectador,
                          char fila,
                          char columna) {
        if (espectador.getEdad() < pelicula.getEdadMinima()) {
            return false;
        }
        if (espectador.getSaldo() < pelicula.getPrecio()) {
            return false;
        }
        if (asientos[convertirFila(fila)][convertirColumna(columna)]
                .getEspectador() != null)
            return false;

        return true;
    }
}




