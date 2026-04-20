import U3Ej4.Coche;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio1 = 0;
        double precio2 = 0;
        String marca1 = "";
        String marca2 = "";
        String nuevaMarca;
        System.out.println("Introduce el precio del coche 1");
        precio1 = sc.nextDouble();
        System.out.println("Inrtdocue la marca del coche 1");
        sc.nextLine();
        marca1 = sc.nextLine();
        System.out.println("Introduce el precio del coche 2");
        precio2 = sc.nextDouble();
        System.out.println("Inrtdocue la marca del coche 2");
        sc.nextLine();
        marca2 = sc.nextLine();
        Coche a1 = new Coche(precio1, marca1);
        Coche a2 = new Coche(precio2, marca2);
        System.out.println("La marca del coche 1 es " + a1.getMarcaCoche() + " el precio sin iva es de " + a1.getPrecioSinIva() + " el precio con iva es de " + a1.CalcularPrecioIva(a1) + " . " + a1.empezar_conducir());
        System.out.println("La marca del coche 2 es " + a2.getMarcaCoche() + " el precio sin iva es de " + a2.getPrecioSinIva() + " el precio con iva es de " + a2.CalcularPrecioIva(a2) + " . " + a2.empezar_conducir());
        if (a2.compararPrecioCoche(a1) == 0) {
            System.out.println("El precio del coche 2 es igual que el del primero");
        } else if (a2.compararPrecioCoche(a1) == -1) {
            System.out.println("El precio del coche 2 es menor que el del primero");
        } else System.out.println("El precio del coche 2 es mallor que el del primero");
        System.out.println("Cambia la marca del coche 1");
        System.out.println(c1.setmarca(sc.nextLine()));
        System.out.println("La marca del coche 1 ahora es "+a1.getMarcaCoche());
    }
}