import ud3clase.Calculo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precio = 0;
        int puntos = 0;
        int cantidad= 0;
        System.out.println("Introduce un precio de coste");
        Calculo trabajo1 = new Calculo();
        precio = sc.nextInt();
        trabajo1.setPrecio(precio);
        System.out.println("El precio es "+trabajo1.getPrecio());
System.out.println("Introduce el número de puntos");
        puntos = sc.nextInt();
        trabajo1.incrementar(puntos);
        System.out.println("Cuenta con "+trabajo1.getPuntuacion()+" puntos.");
        System.out.println("Introduce la cantidad");
        cantidad = sc.nextInt();
        trabajo1.descontar(cantidad);
        System.out.println("Ahora cuenta con "+trabajo1.getTotal()+" puntos.");
    }
}