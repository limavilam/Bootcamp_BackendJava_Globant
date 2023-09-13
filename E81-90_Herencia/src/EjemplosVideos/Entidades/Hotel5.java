package EjemplosVideos.Entidades;

public final class Hotel5 extends Hotel4 {

    //cuando coloco el final, nadie puede tomar herencia del hotel 5.

    protected boolean casino = true;
    protected boolean restaurant = true;

    public Hotel5(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }

}

