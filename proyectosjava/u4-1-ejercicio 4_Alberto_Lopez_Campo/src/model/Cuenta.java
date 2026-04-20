package model;

public class Cuenta {
    private String nombre;
    private int importe;

    public Cuenta(int importe, String nombre) {
        this.importe = importe;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImporte() {
        return importe;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
    public void integrar(int dinero){
        this.importe+=dinero;
    }
    public void reintegrar(int dinero){
        this.importe-=dinero;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", importe=" + importe +
                '}';
    }
}
