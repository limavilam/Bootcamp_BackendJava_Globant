package geometry.shape;

import java.util.Scanner;

public class Rectangulo {
    private double base;
    private double altura;

    //Métodos get y set
    public double getBase(){
        return this.base;
    }
    public void setBase(double base){
        this.base =base;
    }
    public double getAltura(){return this.altura;}
    public void setAltura(double Altura){
        this.altura =altura;
    }

    //Método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
    public void cargarRectangulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de la base del rectángulo:");
        base = scanner.nextDouble();
        System.out.print("Ingrese el valor de la altura del rectángulo:");
        altura = scanner.nextDouble();
    }

    //Método para calcular el área y perímetro del rectángulo.
    public double area(){
        return  base * altura;
    }
    public double perimetro(){
        return 2*(altura+ base);
    }

    //Método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
    public double dibujoRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (j == 0 || j == base - 1 || i == 0 || i == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); //Me da el espacio de los cuadrados.
        }
        return 0;
    }
}
