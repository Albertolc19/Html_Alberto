import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuando le des enter enpezara el programa");
        String continua = sc.nextLine();
    int nrandom;
    int nminimo =0;
    int repetcion;
    int nmaximo =99;
    //Pedimos el numero de repeticiones que quiere al usuairo y comprobamos que sea un numero.
        System.out.println("Introduce el numero random que quieres:");
        while (!sc.hasNextInt()) {
        System.out.println("Introduce un numero por favor:");
            sc.nextLine();
    }
        repetcion=sc.nextInt();
        sc.nextLine();
    //Comrpobamos que el numero no sea 0 para que funcione el programa.
        if (repetcion<=0) {
            while (1 > repetcion) {
                System.out.println("Introduce un numero valido por fabor:");
                int repbien= sc.nextInt();
                repetcion=repbien;
                sc.nextLine();
            }
        }
        System.out.println("los mumeros random son: ");
        for (int contador = 1; contador <= repetcion; contador++ ){
            nrandom = (int) (Math.random() * 100) + 1;
            if (nrandom > nminimo) {
                nminimo = nrandom;
            }
            if (nrandom < nmaximo)
                nmaximo = nrandom;
            if (contador < repetcion)
                System.out.print(nrandom +", ");
            else
                System.out.print(nrandom +".");
    }
        System.out.println("\nEl numero mas grande de la secuencia es "+ nminimo);
        System.out.println("El numero mas pequeño de la secuencia es "+ nmaximo);
}
}