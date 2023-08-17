package Ejercicios.RuletaRusa.JuegoRuletaRusaV2;

public class JuegoRuletaRusa {

    private JugadorRuleta[] jugadores;
    private Revolver revolver;

    public JuegoRuletaRusa(int numJugadores) {

        jugadores = new JugadorRuleta[comprobarJugadores(numJugadores)];

        jugadores = new JugadorRuleta[numJugadores];

        crearJugadores();

        revolver = new Revolver();
        System.out.println(revolver);
    }
    private int comprobarJugadores(int numJugadores){
        if (!(numJugadores >= 1 && numJugadores <= 6)) {
            numJugadores = 6;
        }
        return numJugadores;
    }
    private void crearJugadores(){
        for (int i=0; i<jugadores.length; i++){
            jugadores[i] = new JugadorRuleta(i+1);
        }
    }

    public boolean finJuego() { //Comprueba si está vivo o no.
        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isVivo()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].disparar(revolver);
            System.out.println(revolver);
        }
    }
}

