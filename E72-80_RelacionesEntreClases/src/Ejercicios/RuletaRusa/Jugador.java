package Ejercicios.RuletaRusa;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(RevolverAgua revolver) {
        System.out.println(nombre + " se apunta y aprieta el gatillo...");

        if (revolver.mojar()) {
            System.out.println("¡Agua! " + nombre + " se mojó.");
            mojado = true;
            return true;
        } else {
            System.out.println("¡Click! " + nombre + " se salvó.");
            revolver.siguienteChorro();
            return false;
        }
    }

    public boolean estaMojado() {
        return mojado;
    }

    public String getNombre() {
        return nombre;
    }
}

