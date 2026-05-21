package model;

public class Cuenta {
    private int nombre;
    private int numero;
    private int balance;
    protected Banco b1=new Banco();

    public Cuenta(int numero, int balance) {
        this.numero = numero;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", balance=" + balance +
                '}';
    }
}
