package entidad;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        this.cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int tamano) {
        System.out.println("Sirviendo café *****");
        if(this.cantidadActual == 0)
            System.out.println("La cafetera esta vacía, no se puede llenar la tasa");
        if(tamano > this.cantidadActual) {
            System.out.println("El tamaño requerido supera la capacidad de la cafetera, la taza no se pudo llenar" +
                    " la cantidad servida en la taza es de " + this.cantidadActual);
            vaciarCafetera();
        } else {
            System.out.println("La taza se ha llenado completamente");
            this.cantidadActual -= tamano;
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {
        if(cantidad < 0 )
            System.out.println("No se pueden agregar cantidades negativas");
        else
            this.cantidadActual += cantidad;
    }
}
