package model;

public class Cuenta {
    private int numero;
    private int saldo;

    public Cuenta(int numero, int saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
