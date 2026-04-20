import ej9_2.ProcesadorPalabras;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra="";
        for(int contador=0; contador < 4; contador++){
            System.out.println("Introduce la palabra "+contador);
            palabra= sc.nextLine();
System.out.println("La primera sigla de la palabra es:"+ ProcesadorPalabras.primeraSigla(palabra));

        }
    }
}