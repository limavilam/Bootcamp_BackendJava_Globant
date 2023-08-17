package Ejercicios.RuletaRusa;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void llenarJuego() {
        revolver.llenarRevolver();
    }

    public void ronda() {
        for (Jugador jugador : jugadores) {
            if (!jugador.estaMojado()) {
                boolean mojado = jugador.disparo(revolver);
                if (mojado) {
                    mostrarResultado(jugador);
                    return;
                }
            }
        }
    }

    private void mostrarResultado(Jugador jugadorMojado) {
        System.out.println("¡El jugador " + jugadorMojado.getNombre() + " se mojó!");
        System.out.println("¡Fin del juego!");
    }
}
