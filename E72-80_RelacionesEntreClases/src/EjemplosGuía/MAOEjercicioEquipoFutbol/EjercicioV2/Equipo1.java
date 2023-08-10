package EjemplosGuía.MAOEjercicioEquipoFutbol.EjercicioV2;

import java.util.ArrayList;

public class Equipo1 {
    ArrayList<Jugador1> jugadores = new ArrayList<>();

    public void agregarJugador(Jugador1 jugador) {
        jugadores.add(jugador);
    }

    public void mostrarJugadores() {
        for (Jugador1 jugador : jugadores) {
            System.out.println("Nombre: " + jugador.nombre);
            System.out.println("Apellido: " + jugador.apellido);
            System.out.println("Posición: " + jugador.posicion);
            System.out.println("Número: " + jugador.numero);
            System.out.println();
        }
    }
}
