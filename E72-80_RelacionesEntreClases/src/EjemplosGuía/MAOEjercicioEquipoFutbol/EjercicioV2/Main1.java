package EjemplosGuía.MAOEjercicioEquipoFutbol.EjercicioV2;

public class Main1 {
    public static void main(String[] args) {
        Equipo1 equipo = new Equipo1();

        Jugador1 jugador1 = new Jugador1("Lionel", "Messi", "Delantero", 10);
        Jugador1 jugador2 = new Jugador1("Sergio", "Ramos", "Defensor", 4);
        Jugador1 jugador3 = new Jugador1("Andrés", "Iniesta", "Centrocampista", 8);

        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        equipo.mostrarJugadores();
    }
}
