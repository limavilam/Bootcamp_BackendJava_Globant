package Ejercicios.Cine;

public class Espectador {

    private String nombre;
    private int edad;
    private float saldo;

    public Espectador(String nombre, int edad, float saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getSaldo() {
        return saldo;
    }

    public static Espectador crearEspectador(){
        Generador gen = Generador.getGenerador();
        return new Espectador(gen.sigNombre(), gen.sigEdad(),gen.sigSaldo());
    }

}
