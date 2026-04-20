import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int suma = 0;
        System.out.println("Introduce un numero");
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un numero por favor:");
            sc.nextLine();
        }
        num1 = sc.nextInt();
        while (num1 != 0) {
            System.out.println("Introduce otro numero, cuando quieras terminar la suma pon 0");
            suma += num1;
            sc.nextLine();
                while (!sc.hasNextInt()) {
                    System.out.println("Introduce un numero por favor:");
                    sc.nextLine();
                }
            num1 = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("La suma total es " + suma);
    }
}


