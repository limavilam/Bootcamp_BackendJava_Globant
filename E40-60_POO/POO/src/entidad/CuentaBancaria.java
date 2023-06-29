package entidad;

public class CuentaBancaria {

    private int numeroCuenta;
    private long clienteDNI;
    private int saldoActual;

    //Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    public CuentaBancaria(){}
    public CuentaBancaria(int numeroCuenta, long clienteDNI, int saldoActual){
        this.numeroCuenta = numeroCuenta;
        this.clienteDNI = clienteDNI;
        this.saldoActual = saldoActual;
    }
    //Agregar los métodos getters y setters correspondientes

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getClienteDNI() {
        return clienteDNI;
    }

    public void setClienteDNI(long clienteDNI) {
        this.clienteDNI = clienteDNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
}
