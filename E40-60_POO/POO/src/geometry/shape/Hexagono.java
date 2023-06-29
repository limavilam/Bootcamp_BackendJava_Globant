package geometry.shape;

public class Hexagono {
    private double apotema;
    private double lado;

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Hexagono(double apotema, double lado) {
        this.apotema = apotema;
        this.lado = lado;
    }

    public double area(){
        return (6*lado * apotema)/2;
    }
    public double perimetro(){
        return (6*lado);
    }
}
