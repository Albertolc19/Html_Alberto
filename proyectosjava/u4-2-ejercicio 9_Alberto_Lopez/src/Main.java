import model.CuentaCliente;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaCliente cuenta = new CuentaCliente("David");
        int opcion;
        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Registrar cuenta a través de DNI");
            System.out.println("2. Registrar cuenta a través de Nombre y Apellidos");
            System.out.println("3. Registrar cuenta a través de día, mes y año de nacimiento");
            System.out.println("4. Borrar Cuenta");
            System.out.println("5. Mostrar Cuenta");
            System.out.println("6. Salir\n");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Introduce el DNI: ");
                    String dni = sc.nextLine();
                    System.out.println("Cuenta generada: " + cuenta.registrarCuenta(dni));
                    break;

                case 2:
                    System.out.print("Introduce el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Introduce los apellidos: ");
                    String apellidos = sc.nextLine();
                    System.out.println("Cuenta generada: " +
                            cuenta.registrarCuenta(nombre, apellidos));
                    break;

                case 3:
                    System.out.print("Introduce el día: ");
                    int dia = sc.nextInt();
                    System.out.print("Introduce el mes: ");
                    int mes = sc.nextInt();
                    System.out.print("Introduce el año: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Cuenta generada: " +
                            cuenta.registrarCuenta(dia, mes, anio));
                    break;

                case 4:
                    cuenta=null;
                    System.out.println("Cuenta borrada correctamente.");
                    break;

                case 5:
                    System.out.println(cuenta);
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);
    }
}