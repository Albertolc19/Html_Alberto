import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 1 numero entero para que te haga su tabala de multiplicar hasta 10.");
        System.out.println("Escrive el numero entero=");
        double numU = 0;
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada incorrecta");
            System.out.println("Eso no es un numero, introduce un numero por fabor.");
            sc.nextLine();
        }
        numU = sc.nextDouble();
        int num = 1;
        while (numU % 1 != 0) {
            System.out.println("Entrada incorrecta");
            System.out.println("Introduce un numero entero por fabor=");
            numU = sc.nextDouble();
        }
        System.out.println("la tabla del numero " + numU + " es:");
        while (num <= 10) {
            double tabla = num * numU;
            System.out.println(num + " * " + numU + " = " + tabla);
            num++;
        }


    }
}