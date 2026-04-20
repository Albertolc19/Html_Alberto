import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mete un numero");
        int numero = sc.nextInt();

        String espar = (numero % 2 == 0) ? "par" : "impar";

        switch (espar) {
            case "par":
                System.out.println("El nº " + numero + " es par.");
                break;
            case "impar":
                System.out.println("El nº " + numero + " no es par.");
                break;


        }
    }
}