import java.util.Scanner;

public class Main {
    public static boolean determinarParImpar(int numeroP) {
        int comprNumPar = 0;
        int contNumPar = 0;
        boolean numPar = true;
        do {
            comprNumPar = numeroP % 10;
            numeroP =  numeroP / 10;
            if (comprNumPar % 2 == 0) {
                contNumPar++;
            }
        } while (numeroP != 0);
        if (contNumPar == 4) {
        } else numPar = false;
        return numPar;
    }

    public static boolean comprobarNumero(int n1) {
        boolean numtrue = true;
        if (n1 > 999 && n1 <= 9999) {
            numtrue = false;
        }
        return numtrue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroP = 0;
        boolean num0= true;
        do {
            do {
                System.out.println("Introduce un numero de 4 digitos por favor");
                numeroP = sc.nextInt();
                sc.nextLine();
                if (numeroP==0) {
                    num0 = false;
                    break;
                }
            } while (comprobarNumero(numeroP));
            if (numeroP==0) {
            }else if (determinarParImpar(numeroP)) {
                System.out.println("Todos sus numeros son pares");
            } else System.out.println("Tiene numeros impares");
        }while(num0);
    }
}