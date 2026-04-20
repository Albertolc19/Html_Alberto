package ejercicio6_2;

public class Cliente {
    private String nombre;
    private int numCuenta;
    private int clave;
    private double saldo;

    public Cliente(String nombre, int numCuenta, int clave, double saldo) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.clave = clave;
        this.saldo = saldo;
    }

    public Cliente(String nombre, int clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getClave() {
        return clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Bienvenid@ " + nombre + " tu clave es: " + clave;
    }

    public static Cliente identificarCliente(int clave, Cliente marta, Cliente julio) {
        if (clave == marta.getClave()) {
            return marta;
        } else if (clave == julio.getClave()) {
            return julio;
        } else {
            return null;
        }
    }

    public void ingresarDinero(double ingresar) {
        saldo += ingresar;
    }

    public void transferirDinero(Cliente destino, double cantidad) {
        this.saldo -= cantidad;
        destino.saldo += cantidad;
    }

    public void retirarDinero(double retirar) {
        saldo -= retirar;
    }

    public int cambiarClave(int nuevaClave) {
            return this.clave = nuevaClave;
    }

}