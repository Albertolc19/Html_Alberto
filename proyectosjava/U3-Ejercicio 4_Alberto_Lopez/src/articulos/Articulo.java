package articulos;

public class Articulo {
    private String nombre;
    private Double precio;

    public Articulo(String n, Double p) {
        this.nombre = n;
        this.precio = p;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean masBaratoQue(Articulo a) {
        return this.precio < a.getPrecio();
    }
}