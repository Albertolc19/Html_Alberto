import model.Equipo;
import model.Jugador;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Equipo ravits=new Equipo("ravits","madrid");
        String[] posiciones = {"Base", "Escolta", "Alero", "Ala-Pivot", "Pivot"};
        for(int i=0;i<ravits.getJugadores().length;i++){
            System.out.println("La posicion del jugador "+(i+1)+" es: "+posiciones[i]+"\n¿Cuales son sus datos?");

            System.out.print("Número: ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            ravits.getJugadores()[i]=new Jugador(numero,nombre,altura,peso,edad,posiciones[i]);
        }
        System.out.println("\n" + ravits.toString());
    }
}