package model;

public class Tienda {
    private Trabajador[] trabajadores;
    private int contador = 0;

    public Tienda() {
        trabajadores = new Trabajador[20];
    }

    public String agregarTrabajador(Trabajador a) {
        String resultado = "";
        if (contador < trabajadores.length) {
            trabajadores[contador] = a;
            contador++;
            resultado = "Añadido correctamente";
        } else {
            resultado = "No hay mas espacio";
        }
        return resultado;
    }

    public String mostrarTrabajadores() {
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            resultado += trabajadores[i];
        }
        return resultado;
    }

    public double salarioMedio() {
        double suma = 0;

        for (int i = 0; i < contador; i++) {
            suma += trabajadores[i].getSalario();
        }

        return suma / contador;
    }

    public String cambiarSalario(String dni, double nuevoSalario) {
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            if (trabajadores[i].getDni().equals(dni)) {
                trabajadores[i].setSalario(nuevoSalario);
                resultado = "Se cambio correctamente";
                break;
            } else {
                resultado = "Fallo en el cambio de salario";
            }
        }
        return resultado;
    }
}
