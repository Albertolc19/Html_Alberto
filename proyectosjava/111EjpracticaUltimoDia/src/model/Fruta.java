package model;

public class Fruta extends Producto{
    private int peso;

    public Fruta(String nombre, int precio, int peso) {
        super(nombre, precio);
        this.peso = peso;
    }

    @Override
    public double calcularIva() {
        return getPrecio()*0.21;
    }

}
