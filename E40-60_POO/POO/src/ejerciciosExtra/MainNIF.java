package ejerciciosExtra;

public class MainNIF {
    public static void main(String[] args) {
        NIF nif = new NIF();
        nif.setNumeroDNI(39650052);
        nif.crearNif();
        System.out.println("Número DNI: " + nif.getNumeroDNI()); // Imprime el número DNI
        nif.mostrarNif();
    }
}
