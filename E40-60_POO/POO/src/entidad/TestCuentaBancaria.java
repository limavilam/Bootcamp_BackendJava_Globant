package entidad;

import java.util.Scanner;

public class TestCuentaBancaria {

    //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public static CuentaBancaria crearCuenta(){
        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creando nueva cuenta");
        System.out.print("Ingrese el número de cuenta: ");
        cuenta.setNumeroCuenta(scanner.nextInt());
        System.out.print("Ingrese el DNI del cliente: ");
        cuenta.setClienteDNI(scanner.nextLong());
        System.out.print("Ingrese el saldo actual de la cuenta: ");
        cuenta.setSaldoActual(scanner.nextInt());
        return cuenta;
    }

    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    //y se la sumara a saldo actual.

    public static void ingresar(CuentaBancaria cuentaMetodo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la suma de dinero a ingresar: ");
        double ingreso = scanner.nextDouble();
        cuentaMetodo.setSaldoActual((int) (cuentaMetodo.getSaldoActual() + ingreso));
    }

    //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    //la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    //pondrá el saldo actual en 0.
    public static void retiro(CuentaBancaria cuentaMetodo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la suma de dinero a retirar: ");
        double retiro = scanner.nextDouble();
        if (retiro <= cuentaMetodo.getSaldoActual()) {
            cuentaMetodo.setSaldoActual((int) (cuentaMetodo.getSaldoActual() - retiro));
        } else {
            cuentaMetodo.setSaldoActual(0);
        }
    }


    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    //usuario no saque más del 20%.
    public static void extraccionRapida(CuentaBancaria cuenta) {
        double limiteExtraccion = cuenta.getSaldoActual() * 0.2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la suma de dinero para realizar la extracción rápida : ");
        double retiro = scanner.nextDouble();
        if (retiro <= limiteExtraccion) cuenta.setSaldoActual((int) (cuenta.getSaldoActual() - retiro));
        else {
            System.out.println("No puede retirar más del 20% del saldo actual.");
        }
    }

    public static void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

    // Método consultarDatos: muestra todos los datos de la cuenta
    public static void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getClienteDNI());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = crearCuenta();

        ingresar(cuenta);
        retiro(cuenta);
        extraccionRapida(cuenta);
        consultarSaldo(cuenta);
        consultarDatos(cuenta);
    }
}
