package model;

public class Persona implements Runnable {
    private String nombre;
    private String apellido;
    private Double velocidad;

    public Persona(String nombre, String apellido, double velocidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.velocidad = velocidad;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    @Override
    public String getApellidos() {
        return apellido;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public double getVelocidad() {
        return velocidad;
    }
}
