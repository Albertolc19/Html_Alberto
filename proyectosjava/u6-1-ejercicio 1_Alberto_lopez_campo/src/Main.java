import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            // a) Tratamiento de división por cero
            System.out.println("--- Fragmento a) ---");
            try {
                int a = 4;
                int b = 0;
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por cero.");
            }

            // b) Tratamiento de índice de array fuera de rango
            System.out.println("\n--- Fragmento b) ---");
            try {
                int[] array = new int[5];
                // Intentar acceder a la posición 5 en un array de tamaño 5 lanza excepción
                // (los índices válidos son del 0 al 4)
                array[5] = 1;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: La posición indicada está fuera de los límites del array.");
            }

            // c) Tratamiento de error al introducir datos (probar a introducir un decimal)
            System.out.println("\n--- Fragmento c) ---");
            Scanner scn = new Scanner(System.in);
            try {
                System.out.println("Introduce un número entero:");
                // Si el usuario introduce un decimal (ej. 5.5) o texto, lanzará InputMismatchException
                int n = scn.nextInt();
                System.out.println("Número introducido: " + n);
            } catch (InputMismatchException e) {
                System.out.println("Error: El valor introducido no es un número entero válido.");
            } finally {
                scn.close();
            }
    }
}