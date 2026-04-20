package U3Ej6;

public class Empleado {
    private int numeroEmpleado;
    private static int contadorEmpleado = 0;

    public Empleado() {
        contadorEmpleado++;
        numeroEmpleado = contadorEmpleado;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }
}

