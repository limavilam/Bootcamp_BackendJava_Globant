package ejerciciosExtra;

public class NIF {

    private long numeroDNI;
    private String letra;

    public NIF() {
    }

    public long getNumeroDNI() {
        return numeroDNI;
    }

    public void setNumeroDNI(long numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    // Método crearNIF
    public void crearNif() {
        int residuo = (int) (numeroDNI % 23);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        this.letra = String.valueOf(letras[residuo]);
    }

    public void mostrarNif() {
        String nifCompleto = numeroDNI + "-" + letra.toUpperCase();
        System.out.println("NIF: " + nifCompleto);
    }
}




