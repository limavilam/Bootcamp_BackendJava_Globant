package Ejercicios.RuletaRusa.JuegoRuletaRusaV2;

public class JugadorRuleta {

    private int id;
    private String nombre;
    private boolean vivo;

    public JugadorRuleta(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void disparar(Revolver r) {
        System.out.println("El" + nombre + " se apunta con la pistola");
        if (r.disparar()) {
            this.vivo = false; //El jugador muere
            System.out.println("El " + nombre + "ha muerto");
        } else {
            System.out.println("El " + nombre + "se ha salvado de morir");
        }
    }
}

