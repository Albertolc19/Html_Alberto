package model;

public class Empresa {
    private String nombre;
    private double presupuesto;
    private Empleado[] listaEmpleados;

    public Empresa(String nombre, double presupuesto) {
        this.nombre = nombre;L
        this.presupuesto = presupuesto;
        this.listaEmpleados = new Empleado[5];
    }

    public void addEmpleado(Empleado e) {
        for (int i = 0; i < listaEmpleados.length; i++) {
            if (listaEmpleados[i] == null) {
                listaEmpleados[i] = e;
                return;
            }
        }
    }

    public String consultarEmpleado(int posicion) {
        try {
            if (listaEmpleados[posicion] == null) {
                return "Error: No existe un empleado en la posición " + posicion;
            }
            return listaEmpleados[posicion].toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Error: La posición " + posicion + " está fuera del rango del array.";
        }
    }

    public void dividirPresupuesto(int num) throws ArithmeticException {
        if (num == 0) {
            throw new ArithmeticException("No se puede dividir el presupuesto entre cero.");
        }
        this.presupuesto /= num;
    }

    @Override
    public String toString() {
        return "Empresa: " + nombre + " | Presupuesto: " + presupuesto;
    }
}
