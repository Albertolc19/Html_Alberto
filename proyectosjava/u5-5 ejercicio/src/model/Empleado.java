package model;

public class Empleado {
    private String dni;
    private String nombre;
    private String puestoTrabajo;
    private double salario;

    public Empleado(String dni, String nombre, String puestoTrabajo, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.puestoTrabajo = puestoTrabajo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", puestoTrabajo='" + puestoTrabajo + '\'' +
                ", salario=" + salario +
                '}'+"\n";
    }
}
