import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int calcularnumero(int n1) {
        int numfinal=0;
        if (n1 <= 2) {
            numfinal=n1 - 1;
        }else {
            int n1serie = 0;
            int n2serie = 1;
            for (int contador = 3; contador <= n1; contador++) {
                numfinal = n1serie + n2serie;
                n1serie = n2serie;
                n2serie = numfinal;
            }
        }
        return numfinal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=0;
        do {
            System.out.println("Introduce un numero entero positivo por favor");
            n1=sc.nextInt();
        }while (n1 <= 0);
        System.out.println("El numero de la tabla es " +calcularnumero(n1));
    }
}