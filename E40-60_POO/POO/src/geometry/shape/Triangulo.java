package geometry.shape;

public class Triangulo {

    private double altura;
    private double base;


    public double getAltura() {
        return altura;
    }
    public double getBase() {
        return base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double area(){
        return  (base * altura)/2;
    }
    public double perimetro(){
        return 3 * base;
    }


}
