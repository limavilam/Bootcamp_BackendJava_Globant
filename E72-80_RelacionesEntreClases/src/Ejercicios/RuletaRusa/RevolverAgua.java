package Ejercicios.RuletaRusa;

import java.util.Random;

public class RevolverAgua {

    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random random = new Random();
        posicionActual = random.nextInt(6); // 6 posiciones del tambor
        posicionAgua = random.nextInt(5); // Posición donde está el agua
    }

    public boolean mojar(){
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro(){
        posicionActual = (posicionActual + 1) % 6;
    }

    public String toString() {
        return "Posición actual: " + posicionActual + ", Posición del agua: " + posicionAgua;
    }
}
