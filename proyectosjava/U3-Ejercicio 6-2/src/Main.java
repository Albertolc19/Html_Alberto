import Articulo;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente marta = new Cliente("Marta", 1, 1234, 100);
        Cliente julio = new Cliente("Julio", 2, 5678, 400);
        Cliente clienteActual;

        do {
            System.out.println("--------------------------------------");
            System.out.print("Introduzca su clave: ");
            int clave = sc.nextInt();
            sc.nextLine();
            clienteActual = Cliente.identificarCliente(clave, marta, julio);
            if (clienteActual == null) {
                System.out.println("Clave errónea, inténtalo de nuevo.");
            }
        } while (clienteActual == null);

        System.out.println("Bienvenid@, " + clienteActual.getNombre());

        String menu = "";
        String opcion = "1.Ingresar dinero.\n2.Realizar transferencia.\n3.Reintegrar o retirar dinero.\n4.Cambiar clave.\n5.Conocer saldo.\n6.Salir\n--------------------------------------";


        do {
            System.out.println("--------------------------------------");
            System.out.println("Seleccione la acción a realizar");
            System.out.println(opcion);
            menu = sc.nextLine();

            switch (menu) {
                case "1":
                    System.out.println("Saldo actual: " + clienteActual.getSaldo() + "€");
                    System.out.println("Ingresa cantidad deseada: ");
                    clienteActual.ingresarDinero(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Saldo tras el ingreso: " + clienteActual.getSaldo() + "€");
                    break;
                case "2":
                    Cliente destino;
                    double cantidad;
                    if (clienteActual == marta) {
                        destino = julio;
                    } else {
                        destino = marta;
                    }
                    System.out.println(clienteActual.getNombre() + " tu saldo actual es de " + clienteActual.getSaldo() + "€\n¿Cúanto deseas transferir a " + destino.getNombre() + "?");
                    cantidad = sc.nextDouble();
                    sc.nextLine();
                    clienteActual.transferirDinero(destino, cantidad);
                    System.out.println("Tu saldo tras la transferencia es de " + clienteActual.getSaldo() + "€");
                    break;
                case "3":
                    System.out.println("Saldo actual: " + clienteActual.getSaldo() + "€");
                    System.out.println("Ingresa cantidad deseada a retirar: ");
                    clienteActual.retirarDinero(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Saldo tras el retiro: " + clienteActual.getSaldo() + "€");
                    break;
                case "4":
                    System.out.println("Introduce la clave actual: ");
                    int clave = sc.nextInt();
                    sc.nextLine();
                    if (clienteActual.getClave() == clave) {
                        System.out.println("--------------------------------------");
                        System.out.println("Introduce la nueva clave que deseas: ");
                        int nuevaClave = sc.nextInt();
                        sc.nextLine();
                        clienteActual.cambiarClave(nuevaClave);
                        System.out.println("Tu nueva clave es: " + clienteActual.getClave());
                    } else {
                        System.out.println("Clave incorrecta, no se pudo cambiar la clave.");
                    }
                    break;
                case "5":
                    System.out.println(clienteActual.getNombre() + ", tu saldo actual es de: " + clienteActual.getSaldo() + "€");
                    break;
            }
        } while (!menu.equals("6") && !menu.equalsIgnoreCase("salir"));
        System.out.println("Adiós, " + clienteActual.getNombre());
    }
}