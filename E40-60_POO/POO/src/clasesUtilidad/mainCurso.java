package clasesUtilidad;

import java.util.Arrays;
import java.util.Scanner;

public class mainCurso {

    //Método cargarAlumnos().
    public static Curso cargarAlumnos(Curso alumno) {
        Scanner scanner = new Scanner(System.in);
        String[] alumnos = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
        }
        alumno.setAlumnos(Arrays.toString(alumnos));
        return alumno;
    }

        public static void crearCurso(Curso curso){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creando un nuevo curso: ");
        System.out.println("Nombre del Curso: ");
        curso.setNombreCurso(scanner.nextLine());
        System.out.println("Cantidad de horas por Dia: ");
        curso.setCantidadHorasPorDia(scanner.nextInt());
        System.out.println("Cantidad de Dias por semana: ");
        curso.setCantidadDiasPorSemana(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Turno : Mañana / Tarde: ");
        curso.setTurno(scanner.nextLine());
        System.out.println("Precio por Hora: ");
        curso.setPrecioPorHora(scanner.nextDouble());
        cargarAlumnos(curso);
    }

    public static void calcularGananciaSemanal(Curso curso ){
        double cantidadAlumnos = curso.getAlumnos().length;
        double gananciaSemanal = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * cantidadAlumnos * curso.getCantidadDiasPorSemana();
        System.out.println("La ganancia semanal para el curso es: " + gananciaSemanal);
    }

    public static void main(String[] args) {
        //Curso alumno1 = cargarAlumnos();
        //Curso alumno2 = cargarAlumnos();
        Curso curso1 = new Curso();
        //Curso curso2 = crearCurso();
        //System.out.println("Los alumnos cargados para el curso 1 son: " + Arrays.toString(alumno1.getAlumnos()));
        //System.out.println("Los alumnos cargados para el curso 2 son: " + Arrays.toString(alumno2.getAlumnos()));
        //System.out.println("La información del curso 1 es: " + Arrays.toString(alumno1.getAlumnos()));

        crearCurso(curso1); //Si no llamó este método no me sale nada de la función crear curso
        //Arrays.stream(curso1.alumnos).forEach(System.out::println);
        calcularGananciaSemanal(curso1);
    }

}

