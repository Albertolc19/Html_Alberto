package model;

public class Trabajador {
    private String dni;
    private String nombre;
    private double salario;
    private String fechaIncorporacion;

    public Trabajador(String dni, String nombre, double salario, String fechaIncorporacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.salario = salario;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public String toString() {
        return "\nTrabajador{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", fechaIncorporacion='" + fechaIncorporacion + '\'' +
                '}'+"\n";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(String fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
}
