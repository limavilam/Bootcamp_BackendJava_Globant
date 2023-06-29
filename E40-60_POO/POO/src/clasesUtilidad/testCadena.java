package clasesUtilidad;

import java.util.Scanner;

public class testCadena {

    public static Cadena mostrarVocales(Cadena cadena){
        int contador = 0;
        String frase = cadena.getFrase();
        for (int i = 0; i < frase.length(); i++) {
            char vocalesFrase = frase.toUpperCase().charAt(i); //No le puedo sacar primero va el mayúsculas al char.
            if (vocalesFrase == 'A' || vocalesFrase == 'E' || vocalesFrase == 'I' || vocalesFrase == 'O' || vocalesFrase == 'U') {
                contador++;
            }
        }
        System.out.println("Cantidad de vocales: " + contador);
        return cadena;
    }
    public static Cadena invertirFrase(Cadena cadena) {  //Otra manera de hacerlo es con StringBuilder reverse()
        String frase = cadena.getFrase();
        String nuevaFrase = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            nuevaFrase += frase.charAt(i);
        }
        System.out.println("La cadena invertida es: " + nuevaFrase);
        //cadena.setFrase(nuevaFrase); // Actualizamos la frase en el objeto Cadena
        return cadena;
    }

    public static void vecesRepetido(Cadena cadena, String letra) {
        String frase = cadena.getFrase();
        char letraRepetida = letra.charAt(0);
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letraRepetida) {
                contador++;
            }
        }
        System.out.println("El carácter '" + letraRepetida + "' se repite " + contador + " veces.");
    }

    public static void compararLongitud(Cadena cadena, String frase) {
        int longitudActual = cadena.getLongitud();
        int longitudOtraFrase = frase.length();

        if (longitudActual > longitudOtraFrase) {
            System.out.println("La frase actual tiene mas caracteres " + "( " + longitudActual + " )" + " que la frase ingresada" + "( " + longitudOtraFrase + " )");
        } else if (longitudActual < longitudOtraFrase) {
            System.out.println("La frase actual tiene menos caracteres " + "( " + longitudActual + " )" + " que la frase ingresada" + "( " + longitudOtraFrase + " )");
        } else {
            System.out.println("La frase actual tiene la misma cantidad de caracteres que la frase ingresada.");
        }
    }

    public static void unirFrases(Cadena cadena, String fraseNueva) {
        String fraseAntigua= cadena.getFrase();
        String fraseUnida = fraseAntigua + " " + fraseNueva;
        System.out.println("La frase queda así:" + fraseUnida);
    }

    public static void contiene(Cadena cadena, String letra) {
        String frase = cadena.getFrase();
        boolean letraContenida = false;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                letraContenida = true;
                break;
            }
        }
        if (letraContenida) {
            System.out.println("La frase contiene la letra " + letra);
        } else {
            System.out.println("La frase no contiene la letra " + letra);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadena cadenaIngresada = new Cadena();

        System.out.print("Ingrese una frase: ");
        cadenaIngresada.setFrase(scanner.nextLine());

        mostrarVocales(cadenaIngresada);
        invertirFrase(cadenaIngresada);

        System.out.print("Ingrese una letra: ");
        String letra = scanner.nextLine();
        vecesRepetido(cadenaIngresada, letra);

        System.out.print("Ingrese una frase a comparar: ");
        String frase = scanner.nextLine();
        compararLongitud(cadenaIngresada, frase);

        System.out.println("Ingrese la frase para unir:");
        String fraseNueva = scanner.nextLine();
        unirFrases(cadenaIngresada,fraseNueva);

        System.out.println("Ingrese la letra que desea verificar:");
        String letraContenida = scanner.nextLine();
        contiene(cadenaIngresada,letraContenida);

    }



}
