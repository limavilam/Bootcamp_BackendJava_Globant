package ejerciciosExtra;

import java.util.Scanner;

public class Ahorcado {
    private char[] palabra;
    private int encontradas;
    private int jugadasMaximas;

    public Ahorcado() {
        palabra = new char[0];
        encontradas = 0;
        jugadasMaximas = 0;
    }

    public Ahorcado(char[] palabra, int encontradas, int jugadasMaximas) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la palabra que va a estar en el ahorcado: ");
        String palabraStr = scanner.nextLine();
        palabra = new char[palabraStr.length()];
        for (int i = 0; i < palabraStr.length(); i++) {
            palabra[i] = palabraStr.charAt(i);
        }
        encontradas = 0;
        System.out.print("Ingresa la cantidad de jugadas máximas permitidas: ");
        jugadasMaximas = scanner.nextInt();
    }

    public int longitud() {
        return palabra.length;
    }

    public boolean buscar(char letra) {
        letra = Character.toLowerCase(letra);
        boolean encontrada = false;
        //for (tipo variable : colección) se conoce como "for-each"
        // o "enhanced for loop" y se utiliza para recorrer una colección de elementos de manera más concisa.
        for (char x : palabra) {
            if (Character.toLowerCase(x) == letra) {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println("La letra se encuentra en la palabra.");
        } else {
            System.out.println("La letra no se encuentra en la palabra.");
        }
        return encontrada;
    }

    public void encontradas(char letra) {
        letra = Character.toLowerCase(letra);
        //Almacena el valor actual de la variable encontradas antes de hacer la búsqueda de la letra ingresada.
        int encontradasAntesDeBusqueda = encontradas;
        for (char c : palabra) {
            if (Character.toLowerCase(c) == letra) {
                encontradas++;
            }
        }
        System.out.println("Letras encontradas: " + encontradas);
        System.out.println("Letras faltantes: " + (palabra.length - encontradas));
        if (encontradas == encontradasAntesDeBusqueda) {
            jugadasMaximas--;
        }
    }

    public int intentos() {
        return jugadasMaximas;
    }

    public void juego() {
        Scanner scanner = new Scanner(System.in);
        while (encontradas < palabra.length && jugadasMaximas > 0) {
            System.out.print("Ingresa la letra a buscar: ");
            char letra = scanner.nextLine().charAt(0);
            buscar(letra);
            encontradas(letra);
            System.out.println("Número de intentos restantes: " + jugadasMaximas);
        }

        if (encontradas == palabra.length) {
            System.out.println("¡Yuju, encontraste la palabra!");
        } else {
            System.out.println("¡Acabas de morir ahorcado! La palabra era: " + new String(palabra));
        }
    }

    public static void main(String[] args) {
        Ahorcado juego = new Ahorcado();
        juego.crearJuego();
        juego.juego();
    }
}

