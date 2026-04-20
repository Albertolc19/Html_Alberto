import model.Criatura;
import model.Jugador;
import model.Orco;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String usuario;
        String a;
        String b;
        System.out.println("Crear Jugador");
        System.out.println("Introduce correo");
        a=sc.nextLine();
        System.out.println("Introduce contraseña");
        b=sc.nextLine();
                Jugador j1 =new Jugador(b,a);
        System.out.println("Menu\n1.Crear Criatura\n" +
                "2.Hacer comer a una determinada criatura\n" +
                "3.Hacer dormir a una determinada criatura\n" +
                "4.Realizar lucha (“Deben intervenir 2 criaturas”)\n" +
                "5.Mostrar características de una determinada criatura\n" +
                "6.Mostrar datos del jugador\n" +
                "Salir");
        do{
            switch (usuario){
                case "1":
                    Criatura
                    break;

            }
        }while (a!="Salir");
    }
}