package tiendapeliculas.service;

import tiendapeliculas.entity.Alquiler;
import tiendapeliculas.entity.Pelicula;

import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ServicioAlquiler {

    private ArrayList<Alquiler> peliculasAlquiladas;

    //Inicializar constructor
    public ServicioAlquiler() {
        this.peliculasAlquiladas = new ArrayList<>();
    }

    public ArrayList<Alquiler> getPeliculasAlquiladas() {
        return peliculasAlquiladas;
    }

    public void setPeliculasAlquiladas(ArrayList<Alquiler> peliculasAlquiladas) {
        this.peliculasAlquiladas = peliculasAlquiladas;
    }

    public Alquiler crearAlquiler(Pelicula pelicula) {
        Date fechaInicio;
        Date fechaFinal;

        fechaInicio = solicitarFechasAlquiler("Inicio");

        fechaFinal = solicitarFechasAlquiler("Final");

        if(fechaInicio.toInstant().isBefore(fechaFinal.toInstant())){
            Alquiler peliculaAlquilada = new Alquiler(pelicula, fechaInicio, fechaFinal, calcularPrecioDeAlquiler(fechaInicio, fechaFinal));
            this.peliculasAlquiladas.add(peliculaAlquilada);
            return peliculaAlquilada;
        }else{
            System.out.println("La fecha de entrega debe ser posterior a la fecha de alquiler");
            return new Alquiler();
        }

    }

    public Date solicitarFechasAlquiler(String mensaje) {

        Scanner scanner = new Scanner(System.in);

        int dia;
        int mes;
        int anio;

        System.out.println("Ingrese el día " + mensaje + ": ");
        dia = scanner.nextInt();

        System.out.println("Ingrese el mes: " + mensaje + ": ");
        mes = scanner.nextInt();

        System.out.println("Ingrese el año:" + mensaje + ": ");
        anio = scanner.nextInt();
        //System.out.println(anio - 1900);

        return new Date(anio - 1900, mes - 1, dia);
    }

    private double calcularPrecioDeAlquiler(Date fechaInicio, Date fechaFinal) {
        double interes = 0;
        int diasAlquilados = (int) ((fechaFinal.getTime() - fechaInicio.getTime()) / (24 * 60 * 60 * 1000));
        if (diasAlquilados > 3)
            interes = (diasAlquilados - 3) * 1.0;
        return 10.0 + interes;
    }

    public double calcularTotalPrecio(){
        double totalIngreso = 0;
        for(Alquiler alquiler: this.peliculasAlquiladas){
            totalIngreso += alquiler.getPrecio();
        }
        return totalIngreso;
    }

    public List<Alquiler> buscarPorFecha(Date fecha){
        return this.peliculasAlquiladas.stream()
                .filter(alquiler -> alquiler.getFechaDeFin().toInstant().equals(fecha.toInstant()))
                .collect(Collectors.toList());
    }
}
