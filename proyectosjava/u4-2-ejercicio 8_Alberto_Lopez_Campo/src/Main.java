import model.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionPrincipal;

        System.out.println("=== Datos Jugador 1 ===");
        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();
        Jugador j1 = new Jugador(nombre1);

        System.out.println("=== Datos Jugador 2 ===");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        Jugador j2 = new Jugador(nombre2);
        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcionPrincipal = sc.nextInt();
            sc.nextLine();

            switch (opcionPrincipal) {
                case 1:
                    System.out.println("=== Datos del Tablero ===");
                    System.out.print("Filas: ");
                    int filas = sc.nextInt();
                    System.out.print("Columnas: ");
                    int columnas = sc.nextInt();
                    Tablero t1 = new Tablero(filas, columnas);
                    sc.nextLine();
                    String opcionJuego;
                    System.out.println("Seleccione el juego:");
                    System.out.println("a. Ajedrez");
                    System.out.println("b. Damas");
                    System.out.println("c. 3 en raya");
                    System.out.print("Opción: ");
                    opcionJuego = sc.nextLine();
                    switch (opcionJuego) {
                        case "a":
                            System.out.println("Introduce el numero de peones: ");
                            int peones = sc.nextInt();
                            System.out.println("Introduce el numero de figuras: ");
                            int figuras = sc.nextInt();
                            Juego ajedrez = new Ajedrez(j1, j2, t1, peones, figuras);
                            System.out.println(ajedrez.jugandoPartida(j1, j2, ajedrez));
                            break;
                        case "b":
                            System.out.println("Introduce el numero de blancas: ");
                            int blancas = sc.nextInt();
                            System.out.println("Introduce el numero de negras: ");
                            int negras = sc.nextInt();
                            Juego damas = new Damas(j1, j2, t1, blancas, negras);
                            System.out.println(damas.jugandoPartida(j1, j2, damas));
                            break;
                        case "c":
                            Juego tresEnRaya = new TresEnRaya(j1, j2, t1);
                            System.out.println(tresEnRaya.jugandoPartida(j1, j2, tresEnRaya));
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcionPrincipal != 2);

    }
}