package Ejercicios.RuletaRusa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            jugadores.add(new Jugador(i));
        }

        RevolverAgua revolver = new RevolverAgua();

        Juego juego = new Juego(jugadores, revolver);
        juego.llenarJuego();

        while (true) {
            juego.ronda();
        }
    }
}