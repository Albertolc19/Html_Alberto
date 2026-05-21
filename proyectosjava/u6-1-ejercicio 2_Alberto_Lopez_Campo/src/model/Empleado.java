package model;

public class Empleado {
    private String nombre;
    private int edad;
    private int experiencia;

    public Empleado(String nombre, int edad, int experiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Empleado [Nombre=" + nombre + ", Edad=" + edad + ", Experiencia=" + experiencia + "]";
    }
}

