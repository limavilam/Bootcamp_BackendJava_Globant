package ejerciciosExtra;

import java.util.Scanner;

public class Ahorcado2 {

    private char[] palabra; //=  new char[] {'P','A','T','I','K','A','L','V','A'};
    private char[] letrasEncontradas;
    private int numIntentos;

    public int getNumIntentos() {
        return numIntentos;
    }

    public Ahorcado2(){}

    public Ahorcado2(char[] palabra, char[] letrasEncontradas, int maxOportunidades){
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.numIntentos = maxOportunidades;
    }

    public Ahorcado2 crearJuego(String palabra, int jugadasMaximas){
        int size = palabra.length();
        char[] palabraVector = new char[size];
        for(int i = 0; i < size; i++)
            palabraVector[i] = palabra.charAt(i);
        this.palabra = palabraVector;
        //Palabras encontradas se inicializa con # en todos los indices
        // char[7] palabra -> {'B','A','B','U','I','N','A'}
        // char[7] letrasEncontradas -> {'#','#','#','#','#','#','#'}
        letrasEncontradas = new char[palabraVector.length];
        for(int i = 0; i < palabraVector.length; i++)
            letrasEncontradas[i] = '#';
        this.numIntentos = jugadasMaximas;
        return this;
    }

    public int longitud(){
        return palabra.length;
    }

    /**
     *
     * @param letra
     * @return un arreglo de enteros con las posiciones donde se encuentra la letra ingresa dentro la palabra
     * // char[7] palabra -> {'B','A','B','U','I','N','A'}  letra a buscar B
     * {0, 2}
     */
    public int[] buscar(char letra){
        StringBuilder indiceDeLetraEnLaPalabra = new StringBuilder();
        for(int index = 0; index < palabra.length; index++){
            if(palabra[index] == letra){
                System.out.println("La letra " + letra + " se encuentra en la palabra en la posicion " + (index+1));
                if(indiceDeLetraEnLaPalabra.length() == 0)
                    indiceDeLetraEnLaPalabra.append(index);
                else
                    indiceDeLetraEnLaPalabra.append(",").append(index);
            }
        }
        String strIndices = indiceDeLetraEnLaPalabra.toString();
        if(!strIndices.isEmpty()){
            String[] charIndex = strIndices.split(",");
            int[] indices = new int[charIndex.length];
            for(int i = 0; i < charIndex.length; i++)
                indices[i] = Integer.parseInt(charIndex[i]);
            return indices;
        }else
            return new int[0];
    }

    public boolean encontradas(char letra){
        int[] indicesLetra = buscar(letra);
        int sizeIndiceLetrasEncontradas = indicesLetra.length;
        for(int index: indicesLetra){
            letrasEncontradas[index] = letra;
        }
        System.out.println("Letras encontradas: " + sizeIndiceLetrasEncontradas);
        System.out.println("Letras restantes: " + (palabra.length-cantidadLetrasAdivinadas()));
        return sizeIndiceLetrasEncontradas > 0;
    }

    public int intentos(){
        return getNumIntentos();
    }

    private boolean adivinoLaPalabra(){
        boolean result = true;
        for(int i = 0; i < letrasEncontradas.length; i++)
            if(letrasEncontradas[i] == '#') {
                result = false;
                break;
            }
        return result;
    }

    private void mostrarPalabrasEncontradas(){
        System.out.println("--------------------------");
        for(int i = 0; i < letrasEncontradas.length; i++)
            System.out.print(letrasEncontradas[i]);
        System.out.println("\n--------------------------");
    }

    private int cantidadLetrasAdivinadas(){
        int cantidad = 0;
        for(int i = 0; i < letrasEncontradas.length; i++)
            if(letrasEncontradas[i] != '#') {
                cantidad ++;
            }
        return cantidad;
    }
    public void juego(){
        Scanner scanner = new Scanner(System.in);
        while(numIntentos >0){
            if (adivinoLaPalabra()){
                System.out.println("Felicidades adivinaste la palabra: " + String.valueOf(palabra));
                break;
            }
            mostrarPalabrasEncontradas();
            System.out.println("Numero de intentos restantes: " + intentos());
            System.out.println("Numero de letras adivinadas " + cantidadLetrasAdivinadas());
            System.out.println("Ingrese una letra:");
            if(!encontradas(scanner.nextLine().charAt(0))){
                System.out.println("La letra no se encuentra en la palabra");
                numIntentos--;
                System.out.println("Te quedan " + intentos() + " intentos");
            }
        }
        if(numIntentos == 0)
            System.out.println("Ahorcado");
    }

    public static void main(String[] args) {
        Ahorcado2 ahorcado = new Ahorcado2();
        Scanner scanner = new Scanner(System.in);
        String palabraIngresada;
        int intentosRealizados;
        System.out.println("Ingrese la palabra que desea buscar en el juego");
        palabraIngresada = scanner.nextLine();
        System.out.println("Ingrese el numero de intentos para adivinar la palabra");
        intentosRealizados = scanner.nextInt();
        ahorcado.crearJuego(palabraIngresada, intentosRealizados);
        ahorcado.juego();
    }
}

