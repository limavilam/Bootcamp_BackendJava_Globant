package geometry;

import java.util.Scanner;

import geometry.shape.*;

public class MainCalculadoraGrafica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Calculadora Geométrica");

        while (true) {
            System.out.println("\nSeleccione una figura geométrica:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Circulo");
            System.out.println("5. Hexágono");
            System.out.println("6. Pentágono");
            System.out.println("7. Rombo");
            System.out.println("0. Salir");
            int opcion = scanner.nextInt();
            if (opcion == 0) {
                System.out.println("¡Hasta luego Babuinitos!");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el lado del cuadrado:");
                    double lado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(lado);
                    System.out.println("El aréa del cuadrado cuando es : " + cuadrado.area());
                    System.out.println("El perimétro del cuadrado es : " + cuadrado.perimetro());
                    break;
                case 2:
                    System.out.println("Ingrese la base del rectángulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double altura = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(base,altura);
                    System.out.println("La superficie del rectángulo: " + rectangulo.area());
                    System.out.println("El perímetro del rectángulo: " + rectangulo.perimetro());
                    break;
                case 3:
                    System.out.println("Ingrese la base del rectángulo:");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double alturaTriangulo = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                    System.out.println("La superficie del triángulo: " + triangulo.area());
                    System.out.println("El perímetro del triángulo: " + triangulo.perimetro());
                    break;
                case 4:
                    System.out.println("Ingrese el radio del circulo:");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    System.out.println("La superficie del círculo es: " + circulo.area());
                    System.out.println("El perímetro del círculo es: " + circulo.perimetro());
                    break;
                case 5:
                    System.out.println("Ingrese el apotema del hexágono:");
                    double apotema = scanner.nextDouble();
                    System.out.println("Ingrese el lado del hexágono:");
                    double ladoHexagono = scanner.nextDouble();
                    Hexagono hexagono = new Hexagono(apotema,ladoHexagono);
                    System.out.println("La superficie del hexágono es: " + hexagono.area());
                    System.out.println("El perímetro del hexágono es: " + hexagono.perimetro());
                    break;
                case 6:
                    System.out.println("Ingrese el apotema del pentágono:");
                    double apotemaPentagono = scanner.nextDouble();
                    System.out.println("Ingrese el lado del pentágono:");
                    double ladoPentago = scanner.nextDouble();
                    Pentagono pentagono = new Pentagono(apotemaPentagono,ladoPentago);
                    System.out.println("La superficie del hexágono es: " + pentagono.area());
                    System.out.println("El perímetro del hexágono es: " + pentagono.perimetro());
                    break;
                case 7:
                    System.out.println("Ingrese la diagonal menor del rombo:");
                    double diagonalMenor = scanner.nextDouble();
                    System.out.println("Ingrese la diagonal mayor del rombo:");
                    double diagonalMayor = scanner.nextDouble();
                    System.out.println("Ingrese el lado del rombo:");
                    double ladoRombo = scanner.nextDouble();
                    Rombo rombo = new Rombo(diagonalMenor, diagonalMayor, ladoRombo);
                    System.out.println("La superficie del hexágono es: " + rombo.area());
                    System.out.println("El perímetro del hexágono es: " + rombo.perimetro());
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}



