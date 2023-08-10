package EjemplosGuía.MAOEjercicioEquipoFutbol;

import java.util.ArrayList;

public class Equipo {

    private ArrayList<Jugador> jugadores;

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void mostrarJugadores() {
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.nombre);
            System.out.println("Apellido: " + jugador.apellido);
            System.out.println("Posición: " + jugador.posicion);
            System.out.println("Número: " + jugador.numero);
            System.out.println();
        }
    }
}
