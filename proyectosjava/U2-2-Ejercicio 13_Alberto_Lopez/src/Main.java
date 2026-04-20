//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numero = 0;
        int par = 0;
        int impar = 0;
        System.out.println("los mumeros random son: ");
        for (int contador = 1; contador <= 20; contador++ ){
            numero = (int) (Math.random() * 50) + 1;
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (contador <= 19)
                System.out.print(numero+", ");
            else
                System.out.print(numero+".");
        }
        System.out.println( "\nEl numero de veces que salio par es "+par+ " y el numero de veces que salio inpar es "+impar);
    }
}