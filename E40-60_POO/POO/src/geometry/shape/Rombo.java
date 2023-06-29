package geometry.shape;

public class Rombo {
    private double diagonalMenor;
    private double diagonalMayor;
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
    public Rombo (double diagonalMayor, double diagonalMenor, double lado){
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public double area(){
        return (diagonalMenor*diagonalMayor)/2;
    }
    public double perimetro(){
        return (4*lado);
    }
}
