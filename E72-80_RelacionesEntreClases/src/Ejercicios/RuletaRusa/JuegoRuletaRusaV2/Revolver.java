package Ejercicios.RuletaRusa.JuegoRuletaRusaV2;

import java.util.Random;

public class Revolver {
    private int posicionBalaActual;
    private int posicionBala;
    public Revolver(){
         Random random = new Random();
         posicionBalaActual = random.nextInt(6);
         posicionBala = random.nextInt(5);
    }

    public boolean disparar(){
        boolean exito = false;
        if (posicionBalaActual == posicionBala){
            exito = true;
        }
        siguienteBala();
        return exito;
    }

    public void siguienteBala(){
        if (posicionBalaActual ==6){
            posicionBalaActual = 1;
        }else{
            posicionBalaActual++;
        }
    }

    public String toString(){
        return "Posición bala actual: " + posicionBalaActual + ", posición bala: " + posicionBala;
    }

}
