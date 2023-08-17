package Ejercicios.CartasEspañolas.CartasEspV2;

public class main {
    public static void main(String[] args) {
        baraja miBaraja = new baraja();

        miBaraja.barajar();
        System.out.println(miBaraja.siguienteCarta());
        System.out.println("Cartas disponibles: " + miBaraja.cartasDisponibles());
        System.out.println(miBaraja.darCartas(5));
        System.out.println(miBaraja.cartasMonton());
        System.out.println("Mostrando toda la baraja:");
        miBaraja.mostrarBaraja();
    }
}
