import model.Empleado;
import model.Empresa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1.- Prueba NullPointerException
        Empresa miEmpresa = null;
        try {
            miEmpresa.toString();
        } catch (NullPointerException e) {
            System.out.println("Punto 1: Capturada excepción de objeto nulo.");
        }

        // 2.- Crear Microsoft
        miEmpresa = new Empresa("Microsoft", 1000);

        // 3.- Crear 4 empleados y añadirlos
        miEmpresa.addEmpleado(new Empleado("Ana", 30, 5));
        miEmpresa.addEmpleado(new Empleado("Luis", 25, 2));
        miEmpresa.addEmpleado(new Empleado("Marta", 40, 15));
        miEmpresa.addEmpleado(new Empleado("Juan", 35, 8));

        // 4.- Consulta posición 2 (Marta)
        System.out.println("Punto 4: " + miEmpresa.consultarEmpleado(2));

        // 5.- Consulta posición 5 (Fuera de rango)
        System.out.println("Punto 5: " + miEmpresa.consultarEmpleado(5));

        // 6.- Consulta posición vacía (Posición 4, ya que añadimos 4 empleados)
        System.out.println("Punto 6: " + miEmpresa.consultarEmpleado(4));

        // 7.- Dividir presupuesto entre 0
        try {
            miEmpresa.dividirPresupuesto(0);
        } catch (ArithmeticException e) {
            System.out.println("Punto 7: Error - " + e.getMessage());
        }

        // 8.- Dividir presupuesto entre 2
        miEmpresa.dividirPresupuesto(2);
        System.out.println("Punto 8: Presupuesto dividido correctamente.");

        // 9.- Mostrar características de la Empresa
        System.out.println("Punto 9: " + miEmpresa.toString());
    }
}