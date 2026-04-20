import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNatural = 0;
        int divNaturales = 0;
        int candivisores = 0;
        //Ejercicio 4
        do {
            System.out.println("Escrtibe un numero natural entero");
            numNatural = sc.nextInt();
        } while (numNatural <= -1);
        System.out.print("Los numeros divisores naturales son: ");
        for (int contador = 1; contador <= numNatural; contador++) {
            if (numNatural % contador == 0) {
                candivisores++;
                if (contador < numNatural) {
                    System.out.print(contador + ", ");
                } else {
                    System.out.print(contador + ". ");
                }
            }
        }
        if (candivisores == 2) {
            System.out.println("\nEl numero es primo");
        } else
            System.out.println("\nEl numero no es primo");
        //Ejercicio 5
        int puesto=0;
        do {
            System.out.println("Escribe a continuacion el puesto en el que quedaste en las olimpiadas de janeiro");
            sc.nextLine();
        }while(!sc.hasNextInt());
        puesto=sc.nextInt();
        switch (puesto){
            case 1:
                System.out.println("Medalla de oro al primer puesto");
                break;
            case 2:
                System.out.println("Medalla de plata al segundo puesto");
                break;
            case 3:
                System.out.println("Medalla de bronce al tercer pueto");
                break;
            default:
                System.out.println("Gracias por participar "+puesto);
                break;
        }
    }
}