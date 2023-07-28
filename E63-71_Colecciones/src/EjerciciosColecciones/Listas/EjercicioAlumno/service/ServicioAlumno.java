package EjerciciosColecciones.Listas.EjercicioAlumno.service;

import EjerciciosColecciones.Listas.EjercicioAlumno.entidades.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    private ArrayList<Alumno> alumnos;
    private Scanner scanner;

    public ServicioAlumno(ArrayList<Alumno> alumnos, Scanner scanner) {
        this.alumnos = alumnos;
        this.scanner = scanner;
    }

    public void crearAlumnos() {

        boolean continuar = true;

        while (continuar) {
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese el nombre completo del alumno: ");
            String nombreIngresado = scanner.next().toUpperCase();

            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + " del alumno: ");
                int nota = scanner.nextInt();
                notas.add(nota);
            }
            this.alumnos.add(new Alumno(nombreIngresado,notas));

            System.out.println("¿Desea agregar otro alumno (S/N) ?");
            String respuestaIngreso = scanner.next().toUpperCase();
            if (respuestaIngreso.equals("N"))
                continuar = false;
        }
    }
    public void mostrarAlumnos() {
        // utilizo el FOREACH
        for (Alumno unitariaPersona : alumnos) {
            System.out.println(unitariaPersona.toString());
        }
    }

    public void notaFinal(){
        System.out.println("Ingrese el nombre del alumno que desea calcular la nota promedio:");
        String nombre = scanner.next().toUpperCase();

        boolean existenciaAlumnno = false;

        for (Alumno alumno:alumnos){
            if (alumno.getNombre().toUpperCase().equals(nombre)){
                existenciaAlumnno = true;
                ArrayList<Integer> alumnoNotas = alumno.getNotas();
                Integer notaFinal = 0;
                if(alumnoNotas !=null){
                    for (Integer nota: alumnoNotas){
                        notaFinal += nota;
                    }
                    notaFinal /=3;
                }
                System.out.println("La nota final del alumno es: "+ notaFinal);
            }
        }
        if (!existenciaAlumnno){
            System.out.println("El alumno no se encuentra en los registros.");
        }

    }
}
