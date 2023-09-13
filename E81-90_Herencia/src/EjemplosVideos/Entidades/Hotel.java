package EjemplosVideos.Entidades;

public class Hotel {

    //Cantidad de habitaciones del hotel.
    //Protected hace referencia a que el atributo es público para la familia
    // y privado para los externos, si otro quiere tomarlo debe usar getters y setters
    protected Integer cantidadHabitaciones;

    //Constructor
    public Hotel(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

}
