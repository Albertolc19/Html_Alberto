import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int piezasLote;
        double longPieza;
        int piezasUtiles = 0;
        System.out.println("Escribe la cantida de lote que quieres procesar.");
        while (!sc.hasNextInt()) {
            System.out.println("Escribe la cantida de lote en numero que quieres procesar.");
            sc.nextLine();
        }
        piezasLote = sc.nextInt();
        for (int contador = 1; contador <= piezasLote; contador++) {
            sc.nextLine();
            System.out.println("Escribe la longitud de la pieza " + contador);
            if (sc.hasNextDouble()) {
                longPieza = sc.nextDouble();
            } else {
                System.out.println("La longitud es incorrecta");
                return;
            }
            if (longPieza >= 1.20 && longPieza <= 1.30) {
                piezasUtiles++;
            }
        }
        System.out.println("La cantidad de piezas utiles son " + piezasUtiles);
        //Ejercicio 2
        System.out.println("Introduce numero hasta que escrivas 0");
        do {
            int numero = sc.nextInt();
            if (numero == 0) break;
            if (numero >= 8) {
                System.out.println("El doble del numero introduciod es " + numero * 2);
            } else {
                System.out.println("El triple del numero introduciod es " + numero * 3);
            }
        } while (true);
        System.out.println("\nFin");
    }
}