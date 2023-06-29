package geometry.shape;

import java.util.Scanner;

public class CalculadoraGrafica {

    //Cuadrado
    private double ladoCuadrado;
    public double getLadoCuadrado(){
        return this.ladoCuadrado;
    }
    public void setLadoCuadrado(double ladoCuadrado){
        this.ladoCuadrado =ladoCuadrado;
    }
    public void cargarCuadrado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado del cuadrado:");
        ladoCuadrado = scanner.nextDouble();
    }
    public double areaCuadrado(){
        return  ladoCuadrado * ladoCuadrado;
    }
    public double perimetroCuadrado(){
        return 4*(ladoCuadrado);
    }
    public double dibujoCuadrado() {
        for (int i = 0; i < ladoCuadrado; i++) {
            for (int j = 0; j < ladoCuadrado; j++) {
                if (j == 0 || j == ladoCuadrado - 1 || i == 0 || i == ladoCuadrado - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); //Me da el espacio de los cuadrados.
        }
        return 0;
    }

    //Rectangulo
    private double baseRectangulo;
    private double alturaRectangulo;
    public double getBaseRectangulo(){return this.baseRectangulo;}
    public void setBaseRectangulo(double baseRectangulo){
        this.baseRectangulo =baseRectangulo;
    }
    public double getAlturaRectangulo(){return this.alturaRectangulo;}
    public void setAlturaRectangulo(double alturaRectangulo){
        this.alturaRectangulo =alturaRectangulo;
    }
    public void cargarRectangulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de la base del rectángulo:");
        baseRectangulo = scanner.nextDouble();
        System.out.print("Ingrese el valor de la altura del rectángulo:");
        alturaRectangulo = scanner.nextDouble();
    }
    public double areaRectangulo(){
        return  baseRectangulo * alturaRectangulo;
    }
    public double perimetroRectangulo(){
        return 2*(alturaRectangulo+ baseRectangulo);
    }
    public double dibujoRectangulo() {
        for (int i = 0; i < alturaRectangulo; i++) {
            for (int j = 0; j < baseRectangulo; j++) {
                if (j == 0 || j == baseRectangulo - 1 || i == 0 || i == alturaRectangulo - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); //Me da el espacio de los cuadrados.
        }
        return 0;
    }
}
