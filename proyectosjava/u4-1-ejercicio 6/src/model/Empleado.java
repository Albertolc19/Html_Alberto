package model;

public class Empleado {
    private String dni="";
    private String nombre="";
    private String apelidos="";
    private int experiencia=0;
    private double salario=0.0;

    public Empleado(String dni, String nombre, String apelidos, int experiencia, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apelidos = apelidos;
        this.experiencia = experiencia;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apelidos='" + apelidos + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApelidos() {
        return apelidos;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
