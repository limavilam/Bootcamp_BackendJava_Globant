package tiendapeliculas.entity;

import java.util.Date;

public class Alquiler {

    Pelicula peliculaAlquilada;
    Date fechaDeInicio;
    Date fechaDeFin;
    double precio;

    public Alquiler() {
    }

    public Alquiler(Pelicula peliculaAlquilada, Date fechaDeInicio, Date fechaDeFin, double precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.precio = precio;
    }

    public Pelicula getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public void setPeliculaAlquilada(Pelicula peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(Date fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler: \n" + this.peliculaAlquilada + "\n Fecha de alquiler: " + this.fechaDeInicio +
                "\n Fecha de entrega " + this.fechaDeFin + "\n Precio: " + this.precio;
    }
}
