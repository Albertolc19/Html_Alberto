import Banco.cuentaBancaria;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datos;
        int ingresarDinero;
        int realizarTranserencia;
        int retirarDinero;
        int camiarClave;
        int conocerSaldo;
        int e;
        String cuentaActual=null;
        cuentaBancaria Marta = new cuentaBancaria("Marta", 1, 1234, 0);
        cuentaBancaria Julio = new cuentaBancaria("Julio", 2, 5678, 0);
        do {
            System.out.println("Inroduce tu clave de cliente ");
            datos=sc.nextInt();
            System.out.println(cuentaBancaria.identificarCliente(datos));
        } while (datos != 1234 && datos != 5678);
        if (datos==1234){
            cuentaActual="Marta";
        }else cuentaActual="Julio";
        do{
            System.out.println("Intoduce La opicon a hacer en el menu: " +
                    "\n1. Ingresar dinero.\n" +
                    "2. Realizar transferencia.\n" +
                    "3. Reintegrar o retirar dinero.\n" +
                    "4. Cambiar clave.\n" +
                    "5. Conocer saldo.\n" +
                    "6. Salir.  ");
            e=sc.nextInt();
            switch (e){
                case 1:
                    System.out.println("Intrduce el dinero que quieres ingrear");
                    ingresarDinero=sc.nextInt();

                    break;
                case 2:
                    System.out.println("Intrduce el dinero que queiras tranferir y a quien");
                    realizarTranserencia=sc.nextInt();

                    break;
                case 3:
                    retirarDinero=sc.nextInt();
                    break;
                case 4:
                    camiarClave=sc.nextInt();
                    break;
                case 5:
                    conocerSaldo=sc.nextInt();
                    break;
            }
        }while (e==6);

    }
}