import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 numeros enteros haciendoq ue el segundo sea malor que el priemro.");
        System.out.println("Escrive el primer numero entero=");
        int num1 = 0;
        int numero = 1;
        while (!sc.hasNextInt()) {
            System.out.println("Entrada incorrecta");
            System.out.println("Eso no es un numero entero, introduce un numero entero por fabor.");
            sc.nextLine();
        }
        num1 = sc.nextInt();
        int num2 = 0;
        System.out.println("Escrive el segundo numero entero=");
        sc.nextLine();
        while (!sc.hasNextInt()) {
            System.out.println("Entrada incorrecta");
            System.out.println("Eso no es un numero entero, introduce un numero entero por fabor.");
            sc.nextLine();
        }
        num2 = sc.nextInt();
        while (num1 > num2) {
            System.out.println("Entrada incorrecta");
            System.out.println("El numero 1 no es mallor que el numero 2.");
            System.out.println("Escrive el numero 2 de nuevo:");
            int num3 = sc.nextInt();
            num2 = num3;
            sc.nextLine();
        }
        while (num1 <= num2) {
            if (numero <= 3) {
                System.out.print(+num1+ "   ");
                num1++;
            }else {
                System.out.println();
                numero = 0;
            }
            numero++;
        }
    }
}