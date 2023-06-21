package entidad;

public class TestOperacion {
    public static void main(String[] args){
        Operacion operacion1 = new Operacion();

        //tengo que llamar a la clase o no tendría números.
        operacion1.crearOperacion();

        System.out.println("La suma de ambos números es : " + operacion1.sumar());
        System.out.println("La resta de ambos números es : " + operacion1.restar());
        System.out.println("La multiplicación de ambos números es : " + operacion1.multiplicar());
        System.out.println("La división de ambos números es : " + operacion1.dividir());

    }
}
