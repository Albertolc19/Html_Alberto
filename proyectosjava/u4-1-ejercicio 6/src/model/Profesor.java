package model;

public class Profesor extends Empleado{
    private double asignaturas=0;
    private String especialidad="";

    public double getAsignaturas() {
        return asignaturas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setAsignaturas(double asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor(String dni, String nombre, String apelidos, int experiencia, double salario, double asignaturas, String especialidad) {
        super(dni, nombre, apelidos, experiencia, salario);
        this.asignaturas = asignaturas;
        this.especialidad = especialidad;
    }
}
