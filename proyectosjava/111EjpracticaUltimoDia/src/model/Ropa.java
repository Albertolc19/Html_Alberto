package model;

public class Ropa extends Producto{
    private String tipo;

    public Ropa(String nombre, int precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public double calcularIva() {
        return getPrecio()*0.10;
    }
}
