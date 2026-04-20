package model;

public class Limpiador extends Empleado{
    private int edad=0;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Limpiador(String dni, String nombre, String apelidos, int experiencia, double salario, int edad) {
        super(dni, nombre, apelidos, experiencia, salario);
        this.edad = edad;
    }
}
