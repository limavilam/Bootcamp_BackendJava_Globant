package Ejercicios.Cine;

public class Asiento {

    //simula que tengo actualmente cero espectadores.
    private Espectador espectador = null;

    public void ubicar(Espectador espectador){
        this.espectador=espectador;
    }

    public Espectador getEspectador(){
        return espectador;
    }
}

