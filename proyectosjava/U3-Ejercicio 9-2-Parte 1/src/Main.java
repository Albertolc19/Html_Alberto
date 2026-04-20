import Ejercicio9.UtilsCadena;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean fin=true;
        char sigla;
        String cadena= new String("");
        do{
            System.out.println("Introduce una cadena de letras, el programa termianra cuando escrivas \"fin\".");
            cadena= sc.nextLine();
            if (cadena.equalsIgnoreCase("fin")) return;
            System.out.println("La longitud de la cadena es:"+UtilsCadena.calcularLongitud(cadena));
            System.out.println("La cadena de texto en mayuscula:"+UtilsCadena.convertirMayusculas(cadena));
            System.out.println("Convertir la cadena a minuscula:"+UtilsCadena.convertirMinusculas(cadena));
            System.out.println("Sacar la sub cadena:"+UtilsCadena.sacarSubcadena(cadena));
            System.out.println("¿Que sigla quieres que cuente?");
            sigla=sc.next().charAt(0);
            System.out.println("La cantidad de veces que sale la sigla es de:"+UtilsCadena.contarCaracteres(cadena, sigla));
            sc.nextLine();
        }while(!cadena.equalsIgnoreCase("fin"));
    }
}