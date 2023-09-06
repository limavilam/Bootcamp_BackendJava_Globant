package Ejercicios.Cine;

import java.util.Random;

public class Generador {

    private Random random = new Random();

    //Me permite tener un único generador, crear una instancia de generador.
    private Generador(){

    }

    public static Generador getGenerador(){
        return new Generador();
    }

    public char sigFila(){
        //Me va a generar las filas la distancia entre esos dos.
        return (char) random.nextInt('8'-'1'+ 1);
    }

    public char sigColumna(){
        return (char) random.nextInt('F'-'A'+ 1);
    }

    public String sigNombre(){
        return "Nombre" + random.nextInt();
    }

    public int sigEdad(){
        return random.nextInt(82);
    }

    public float sigSaldo(){
        //Precio de las boletas
        return random.nextFloat()*20000;
    }
}
