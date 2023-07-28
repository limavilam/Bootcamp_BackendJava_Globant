package EjerciciosColecciones.Listas.EjercicioAlumno.principal;

import EjerciciosColecciones.Listas.EjercicioAlumno.service.ServicioAlumno;

import java.util.ArrayList;
import java.util.Scanner;

public class mainAlumno {
    public static void main(String[] args) {

        ServicioAlumno alumno = new ServicioAlumno(new ArrayList(), new Scanner(System.in));

        alumno.crearAlumnos();
        System.out.println(" ");
        alumno.mostrarAlumnos();
        alumno.notaFinal();
    }
}

