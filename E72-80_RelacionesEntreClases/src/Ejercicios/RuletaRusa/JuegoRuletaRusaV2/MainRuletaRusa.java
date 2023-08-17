package Ejercicios.RuletaRusa.JuegoRuletaRusaV2;

public class MainRuletaRusa {
    public static void main(String[] args) {
        JuegoRuletaRusa juego = new JuegoRuletaRusa(6);

        while(!juego.finJuego()){
            juego.ronda();
        }
        System.out.println("El juego ha terminado");

    }
}
