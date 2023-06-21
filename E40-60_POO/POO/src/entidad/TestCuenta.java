package entidad;

//Necesito una clase con el método main, pues este es el punto de entrada y salida del programa.
public class TestCuenta {
    public static void main(String[] args){
        //constructor
        CCuenta cuenta01 = new CCuenta();

        cuenta01.asignarNombre("Un nombre");
        cuenta01.asignarCuenta("Una cuenta");
        cuenta01.aignarTipoDeInteres(2.5);
        cuenta01.ingreso(12000);
        cuenta01.reintegro(3000);
        //acceder a un miembro de un objeto nombre_objeto.nombre_miembro

        CCuenta cuenta02 = new CCuenta("Un nombre", "una cuenta", 6000, 3.5);


        System.out.println(cuenta01.obtenerNombre());
        System.out.println(cuenta01.obtenerCuenta());
        System.out.println(cuenta01.estado());
        System.out.println(cuenta01.obtenerTipoDeInteres());

        //El método está sobrecargado

        System.out.println(cuenta02.estado());
        System.out.println(cuenta02.obtenerTipoDeInteres());
    }
}
