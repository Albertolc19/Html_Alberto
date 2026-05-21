import molde.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ordenador ordenador = null;
        Portatil portatil = null;
        Telefono telefono = null;

        int opcion;

        do {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1- Crear Ordenador");
            System.out.println("2- Crear Portátil");
            System.out.println("3- Crear Teléfono móvil");
            System.out.println("4- Arrancar Ordenador");
            System.out.println("5- Parar Ordenador");
            System.out.println("6- Ejecutar Programa de Ordenador");
            System.out.println("7- Poner en Reposo Portátil");
            System.out.println("8- Hacer Llamada Teléfono Móvil");
            System.out.println("9- Cargar batería");
            System.out.println("10- Funcionar con batería");
            System.out.println("11- Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Introduzca el nombre del ordenador: ");
                    String nombreOrdenador = sc.nextLine();

                    ordenador = new Ordenador(nombreOrdenador, false);

                    System.out.println("Ordenador creado correctamente.");

                    break;

                case 2:

                    System.out.print("Introduzca el nombre del portátil: ");
                    String nombrePortatil = sc.nextLine();

                    System.out.print("Introduzca la batería del portátil: ");
                    int bateriaPortatil = sc.nextInt();
                    sc.nextLine();

                    portatil = new Portatil(nombrePortatil, false);

                    System.out.println("Portátil creado correctamente.");

                    break;

                case 3:

                    System.out.print("Introduzca el modelo del teléfono: ");
                    String modelo = sc.nextLine();

                    System.out.print("Introduzca la batería del teléfono: ");
                    int bateriaTelefono = sc.nextInt();
                    sc.nextLine();

                    telefono = new Telefono(modelo);

                    System.out.println("Teléfono móvil creado correctamente.");

                    break;

                case 4:

                    if (ordenador != null) {

                        System.out.println(ordenador.arrancar());

                    } else {

                        System.out.println("Debe crear un ordenador primero.");

                    }

                    break;

                case 5:

                    if (ordenador != null) {

                        System.out.println(ordenador.parar());

                    } else {

                        System.out.println("Debe crear un ordenador primero.");

                    }

                    break;

                case 6:

                    if (ordenador != null) {

                        System.out.print("Introduzca el nombre del programa: ");
                        String programa = sc.nextLine();

                        System.out.println(ordenador.ejecutarPrograma(programa));

                    } else {

                        System.out.println("Debe crear un ordenador primero.");

                    }

                    break;

                case 7:

                    if (portatil != null) {

                        System.out.println(portatil.sleep());

                    } else {

                        System.out.println("Debe crear un portátil primero.");

                    }

                    break;

                case 8:

                    if (telefono != null) {

                        System.out.print("Introduzca el nombre de la persona: ");
                        String nombre = sc.nextLine();

                        System.out.print("Introduzca el teléfono: ");
                        String numero = sc.nextLine();

                        System.out.println(telefono.hacerLlamada(nombre, numero));

                    } else {

                        System.out.println("Debe crear un teléfono primero.");

                    }

                    break;

                case 9:

                    System.out.println("1- Cargar batería portátil");
                    System.out.println("2- Cargar batería teléfono");

                    int cargar = sc.nextInt();
                    sc.nextLine();

                    if (cargar == 1) {

                        if (portatil != null) {

                            portatil.cargarBateria();

                            System.out.println("Batería del portátil cargada.");

                        } else {

                            System.out.println("Debe crear un portátil.");

                        }

                    } else if (cargar == 2) {

                        if (telefono != null) {

                            telefono.cargarBateria();

                            System.out.println("Batería del teléfono cargada.");

                        } else {

                            System.out.println("Debe crear un teléfono.");

                        }

                    }

                    break;

                case 10:

                    System.out.println("1- Funcionar con batería portátil");
                    System.out.println("2- Funcionar con batería teléfono");

                    int funcionar = sc.nextInt();
                    sc.nextLine();

                    if (funcionar == 1) {

                        if (portatil != null) {

                            System.out.println(portatil.funcionarConBateria());

                        } else {

                            System.out.println("Debe crear un portátil.");

                        }

                    } else if (funcionar == 2) {

                        if (telefono != null) {

                            System.out.println(telefono.funcionarConBateria());

                        } else {

                            System.out.println("Debe crear un teléfono.");

                        }

                    }

                    break;

                case 11:

                    System.out.println("Saliendo del programa...");
                    break;

                default:

                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 11);

        sc.close();
    }
}