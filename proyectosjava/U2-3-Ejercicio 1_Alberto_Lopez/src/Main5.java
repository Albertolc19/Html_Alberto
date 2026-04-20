import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int visualizarDoble(int n1){
        n1=n1*2;
        return n1;
    }
    public static int visualizarTriple(int n1){
        n1=n1*3;
        return n1;
    }
    public static int comprobar(int n1){
        if (n1<8){
            n1=visualizarTriple(n1);
        }else n1=visualizarDoble(n1);
        return n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numeros, el codigo terminara cuando intrduzcas 0");
        int numero;
        do {
            numero = sc.nextInt();
            System.out.println("El resultado es= "+comprobar(numero));
        } while (numero != 0);
        System.out.println("\nFin");
    }
}