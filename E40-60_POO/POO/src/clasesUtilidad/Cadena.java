package clasesUtilidad;

public class Cadena {
    private String frase;
    private int longitud;

    //Constructores

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }
    //Métodos getter y setter.

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return frase.length();
    }


}
