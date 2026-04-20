import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mete un numero");
        int edad = sc.nextInt();
        if (edad == 1) {
            System.out.println("El número es uno");
        } else {
            if (edad == 2) {
                System.out.println("El número es dos");
            } else {
                System.out.println("El numero es otro número distinto de uno y dos");
            }
        }
        System.out.println("Escribe tu edad");
        int edad1 = sc.nextInt();
        System.out.println("Escribe la edad de tu compañero");
        int edad2 = sc.nextInt();
        if (edad1 < edad2) {
            System.out.println("Soy más joven que mi compañero");
        } else {
            if (edad2 < edad1) {
                System.out.println("Mi compañero es más joven que yo");
            } else {
                if (edad2 == edad1) {
                    System.out.println("Tenemos la misma edad");
                }
            }

        }
        System.out.println("Introduce la presion de la caldera");
        float Presion = sc.nextFloat();
        sc.nextLine();
        if (Presion > 2) {
            System.out.println("Abrir válvula de seguridad");
            Presion = Presion - 1;
        } else {
            System.out.println("Introduce tu nombre por favor");
            String nombre = sc.nextLine();
            System.out.println("Todo esta bien " + nombre);
        }

        System.out.println("Temperatura de aller");
        int temp = sc.nextInt();
        System.out.println("Temperatura de hoy");
        int temp2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Hoy llueve sol?(True/False)");
        boolean clima = sc.nextBoolean();
        if (clima == true) {
            if (temp2 > 20) {
                System.out.println("Hace calor pero está lloviendo");
            } else {
                System.out.println("Hace frio y llueve");
            }
            System.out.println("La suma de la temeratura de aller y hoy es de " + (temp + temp2));
            System.out.println("Mañana habra " + (temp2 + 5) + " de temperatura.");
            if (temp2 <= 20) {
                System.out.println("Parece que llega el otoño y llueve");
            }
        } else {
            if (temp2 <= 20) {
                System.out.println("Parece que llega el otoño pero hace sol");
            }
        }
    }

}