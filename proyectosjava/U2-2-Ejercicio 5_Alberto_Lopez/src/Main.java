import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra y o Y para afirmativo y F o f para negativo");
        String letra = sc.nextLine();
        switch (letra) {
            case "F":
            case "f":
                System.out.println("negativo");
                break;
            case "Y":
            case "y":
                System.out.println("afirmativo");
                break;
            default:
                System.out.println("Entrada incorrecta");
        }
        System.out.println("Escrive un numero entero");
        int numero1 = 0;
        int numero2 = 0;
        boolean A=true;

        if (sc.hasNextInt()) {
            numero1 = sc.nextInt();
        } else {
            System.out.println("El numero es incorecto, no es entero");
            A=false;
        }
        System.out.println("Escrive otro numero entero");
        if (sc.hasNextInt()) {
            numero2 = sc.nextInt();
        } else {
            System.out.println("El numero es incorecto, no es entero");
            A=false;
        }
        sc.nextLine();
        if (A) {
        System.out.println("Introduce una letra S o s para sumar, R o r para restar, D o d para dividir y M o m para multiplicar.");
        String letra2 = sc.nextLine();

            switch (letra2) {
                case "S":
                case "s":
                    System.out.println(numero1 + numero2);
                    break;
                case "r":
                case "R":
                    System.out.println(numero1 - numero2);
                    break;
                case "m":
                case "M":
                    System.out.println(numero1 * numero2);
                    break;
                case "D":
                case "d":
                    System.out.println(numero1 / numero2);
                    break;
                default:
                    System.out.println("Operacion no encontrada");
            }
        }else{System.out.println("uno de los numeros esta mal");}

    }


}
