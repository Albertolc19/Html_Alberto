import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuando le des enter enpezara el programa");
        String continua = sc.nextLine();
        int numusuario=0;
        //Pedimos el numero de repeticiones que quiere al usuairo y comprobamos que sea un numero.
       do {
            System.out.println("introduce un numero entre 1 y 10 por favor.");
            int nummal=sc.nextInt();
            numusuario=nummal;

        }while (numusuario > 10 || numusuario < 1);
       System.out.println("El numero introducido es "+numusuario);



    }
}