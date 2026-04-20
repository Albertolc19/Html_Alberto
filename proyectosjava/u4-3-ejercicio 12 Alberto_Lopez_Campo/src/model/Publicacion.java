package model;

public class Publicacion {
    private int anio;
    private String nombre;

    public Publicacion(int anio, String nombre) {
        this.anio = anio;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "año=" + anio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    public String publicar(){
        return"La publicación se ha publicado en la fecha "+anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
