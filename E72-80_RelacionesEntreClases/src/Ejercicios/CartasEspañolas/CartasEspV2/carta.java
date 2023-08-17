package Ejercicios.CartasEspañolas.CartasEspV2;

public class carta {
    private int numero;
    private String palo;

    public carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
