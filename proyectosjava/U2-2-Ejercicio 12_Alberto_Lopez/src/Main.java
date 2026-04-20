import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int fila = 1;
        int columna = 1;
        int num4 = 1;

        System.out.println("Introduce un numero por favor:");
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un numero por favor:");
            sc.nextLine();
        }
        num = sc.nextInt();

        while (fila <= num) {
            while (columna <= fila) {
                System.out.print(num4+" ");
                columna++;
            }
           columna=1;
            fila++;
            num4++;
            System.out.println("");
        }
    }
}