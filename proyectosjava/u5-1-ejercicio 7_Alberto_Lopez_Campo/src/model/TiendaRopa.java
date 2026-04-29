package model;

public class TiendaRopa {
    private String nombre;
    private String direccion;
    private String ciudad;
    private Producto[] productos;
    private int contador;

    // Constructor
    public TiendaRopa(String nombre, String direccion, String ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.productos = new Producto[100];
        this.contador = 0;
    }

    // Añadir producto
    public void anadirProducto(Producto p) {
        if (contador < productos.length) {
            productos[contador] = p;
            contador++;
        } else {
            System.out.println("No se pueden añadir más productos");
        }
    }

    // Mostrar productos
    public void mostrarProductos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }

    // toString
    @Override
    public String toString() {
        return "Tienda: " + nombre + ", Dirección: " + direccion + ", Ciudad: " + ciudad;
    }
}
