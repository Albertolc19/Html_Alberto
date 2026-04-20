package Banco;

public class cuentaBancaria {
    String nombreCliente;
    int numeroCuenta;
    int claveAcceso;
    int saldo;

    public cuentaBancaria(String nombreCliente1, int numeroCuenta1, int claveAcceso1, int saldo1) {
        this.nombreCliente = nombreCliente1;
        this.numeroCuenta = numeroCuenta1;
        this.claveAcceso = claveAcceso1;
        this.saldo = saldo1;
    }

    public String toString() {
        return "Nombre cliente: " + nombreCliente + "\nSu numero de cuenta es: " + numeroCuenta + "\nSu lave de acceso es: " + claveAcceso + "\nY su saldo es: " + saldo;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public int getClaveAcceso() {
        return this.claveAcceso;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public static String identificarCliente(int clave) {
        if (clave == 1234) {
            return "Bienvenida Marta";
        } else if (clave == 5678) {
            return "Bienvenido Julio";
        } else return "Introduce una clave correcta";
    }
}
