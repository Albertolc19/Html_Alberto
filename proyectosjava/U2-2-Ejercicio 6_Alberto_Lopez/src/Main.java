import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 numeros uno pequeño y otro grande para que te consiga todos los numeros que estan entre ellos=");
        System.out.println("Escrive el primer numero=");
        int numero = sc.nextInt();
        System.out.println("Escrive el segundo numero=");
        int numerogrande = sc.nextInt();
        if(numero < numerogrande){
            System.out.println("Los numeros comprendidos entre "+numero+" Y "+numerogrande+" son =");
            while (numero <= numerogrande) {
                System.out.println(+numero);
                numero++;
            }
        }else {
            System.out.println("El segundo numero introducido no es mayor que el primero");
        }
    }
}