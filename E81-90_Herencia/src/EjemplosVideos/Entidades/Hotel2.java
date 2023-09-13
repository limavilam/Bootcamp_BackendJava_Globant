package EjemplosVideos.Entidades;

public class Hotel2 extends Hotel1 {

    //Lo nuevo que hace referencia al hotel de 2 estrellas.
    protected boolean cajaSeguridad = true;


    //Tiene que tener lo  del hotel de 1 estrella y la caja de seguridad.

    public Hotel2(Double precio, Double superficie, Integer cantidadHabitaciones) {
        //Son necesarios para el padre y el abuelo
        super(precio, superficie, cantidadHabitaciones);
    }


}
