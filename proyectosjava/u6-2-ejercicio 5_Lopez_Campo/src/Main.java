import model.BadFoodException;
import model.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Analizador de Comida ---");
        System.out.print("Introduce una comida para analizar: ");
        String comidaUsuario = teclado.nextLine();

        try {
            Test.checkFood(comidaUsuario);
            System.out.println("Disfruta tu comida.");

        } catch (BadFoodException e) {
            System.out.println("\n[ALERTA] Se ha detectado un problema con tu comida.");
            System.out.println("Motivo: " + e.getMessage());

        } finally {
            teclado.close();
            System.out.println("\nEl programa ha finalizado correctamente.");
        }
    }
}