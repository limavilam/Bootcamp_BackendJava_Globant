package EjemplosGuía.MAOEjercicioEquipoFutbol;

import EjemplosGuía.MAOEjercicioProfesor.Dni;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Lionel");
        jugador1.setApellido("Messi");
        jugador1.setPosicion("Delantero");
        jugador1.setNumero(10);

        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);

        System.out.println(jugadores);
    }


}
