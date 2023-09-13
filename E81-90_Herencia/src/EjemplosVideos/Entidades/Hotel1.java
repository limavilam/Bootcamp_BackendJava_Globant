package EjemplosVideos.Entidades;

public class Hotel1 extends Hotel {

    protected Double precio;
    protected Double superficie;
    protected boolean bano = true;
    protected boolean ascensor = true;
    protected boolean calefaccion = true;

    //Constructor que recibe lo necesario para que tenga una estrella el hotel.
    public Hotel1(Double precio, Double superficie, Integer cantidadHabitaciones) {
        //El super estoy llamando o enviando algo al padre de esta clase. Oprime el super y me lleva al constructor del hotel.
        super(cantidadHabitaciones);
        this.precio = precio; //Recibo precio y lo asigno a través de este constructor.
        this.superficie = superficie;
    }

}