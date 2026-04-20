package model;

public class Producto extends TiendaRopa{
    private String tipo;
    private String marca;

    public Producto(String nombre, String direccion, String ciudad, String marca, String tipo) {
        super(nombre, direccion, ciudad);
        this.marca = marca;
        this.tipo = tipo;
    }
}
