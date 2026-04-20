import articulos.Articulo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre1 = "";
        String nombre2 = "";
        Double precio1 = 0.0;
        Double precio2 = 0.0;
        System.out.println("Introduce El nombre del primer atriculo y su precio");
        nombre1 = sc.nextLine();
        precio1 = sc.nextDouble();
        sc.nextLine();
        Articulo a1 = new Articulo(nombre1, precio1);
        System.out.println("Introduce El nombre del segundo atriculo y su precio");
        nombre2 = sc.nextLine();
        precio2 = sc.nextDouble();
        Articulo a2 = new Articulo(nombre2, precio2);
        if (a1.masBaratoQue(a2)) {
            System.out.println("El Articulo 2 con el nombre "+a2.getNombre()+" y el precio "+a2.getPrecio()+" es mas caro");
        } else {
            System.out.println("El Articulo 1 con el nombre "+a1.getNombre()+" y el precio "+a1.getPrecio()+" es mas caro");
        }

    }
}