package geometry;
import geometry.shape.Rectangulo;
public class MainRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.cargarRectangulo();

        System.out.println("Superficie del rectángulo: " + rectangulo.area());
        System.out.println("Perímetro del rectángulo: " + rectangulo.perimetro());

        System.out.println("Dibujo del rectángulo:");
        rectangulo.dibujoRectangulo();
    }
}

