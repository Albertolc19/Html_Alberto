import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numero = 0;
        byte numero2 = 0;
        short sumNaturales = 0;
        short sumNatPar = 0;
        short sumNatImpar = 0;
        int sumNatCuadrados = 0;
        int factorialNum2 = 1;
        byte fecha = 0;
        byte diasmes = 0;
        int anio = 0;
        String nombremes="a";
        //Parte 1
        do {
            System.out.println("Escriva un numero entre 1 y 20 por favor");
            if (sc.hasNextByte()) {
                numero = sc.nextByte();
                sc.nextLine();
            }
        } while (numero < 1 || numero > 20);
        for (int contador = 1; contador <= numero; contador++) {
            sumNaturales += contador;
            sumNatCuadrados += contador * contador;
            if (contador % 2 == 0) {
                sumNatPar += contador;
            } else sumNatImpar += contador;
        }
        System.out.println("La suma de los numeros naturales es " + sumNaturales + " La suma de los naturales pares es de " + sumNatPar + " la suma de los impares es de " + sumNatImpar + " y la suma de los naturales al cuadrado es de " + sumNatCuadrados);
        //Parte 2
        do {
            System.out.println("Escriba un numero menor que 7 positivo");
            if (sc.hasNextByte()) {
                numero2 = sc.nextByte();
            }
        } while (numero2 < 0 || numero2 > 7);
        for (byte contador2 = 1; contador2 <= numero2; contador2++) {
            factorialNum2 = factorialNum2 * contador2;
        }
        System.out.println("El factorial de " + numero2 + " es de " + factorialNum2);
        sc.nextLine();
        //Parte 3
        do {
            System.out.println("Escriba el mes del año de 1 al 12");
            if (sc.hasNextByte()) {
                fecha = sc.nextByte();
                sc.nextLine();
            }
        } while (fecha < 1 || fecha > 12);
        System.out.println("Escribe un año tambien porfavor");
        if (sc.hasNextInt()) {
            anio = sc.nextInt();
            sc.nextLine();
        }
        switch (fecha) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasmes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasmes = 30;
                break;
            case 2:
                if (anio%4 == 0){
                    diasmes=29;
                }
                else{
                    diasmes=28;
                }
                break;
        }
        switch (fecha) {
            case 1:
                nombremes = "Enero";
                break;
            case 2:
                nombremes = "Febrero";
                break;
            case 3:
                nombremes = "Marzo";
                break;
            case 4:
                nombremes = "Abril";
                break;
            case 5:
                nombremes = "Mayo";
                break;
            case 6:
                nombremes = "Junio";
                break;
            case 7:
                nombremes = "Julio";
                break;
            case 8:
                nombremes = "Agosto";
                break;
            case 9:
                nombremes = "Septiembre";
                break;
            case 10:
                nombremes = "Octubre";
                break;
            case 11:
                nombremes = "Noviembre";
                break;
            case 12:
                nombremes = "Diciembre";
                break;
        }
        System.out.println("El mes de " + nombremes + " de el año "+anio+" tiene " + diasmes + " dias.");
    }
}