import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Cuando le des enter enpezara el programa y te pondra un numero entre 1 y 100 ");
        Scanner sc = new Scanner(System.in);
        String continua = sc.nextLine();
        int numero = 0;
        int contador = 1;
        int par = 0;
        int inpar = 0;
        boolean toma = true;
        while (contador <= 30 && numero != 99) {
            numero = (int) (Math.random() * 100) + 1;
            contador++;
            System.out.println(+numero);
            if (numero % 2 == 0) {
                par++;
            } else {
                inpar++;
            }
        }

    }
}