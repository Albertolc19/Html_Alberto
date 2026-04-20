import model.Cubo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        double ancho1 = 0.0;
        double alto1 = 0.0;
        double largo1 = 0.0;
        int peso1 = 0;
        double ancho2 = 0.0;
        double alto2 = 0.0;
        double largo2 = 0.0;
        int peso2 = 0;
        Cubo n1 = null;
        Cubo n2 = null;
        System.out.println("MENU");
        System.out.println("1.Crear cubo1 \n" +
                "2.Crear cubo2\n" +
                "3.Mostrar volumen del Cubo1 y del cubo2\n" +
                "4.Mostrar características del Cubo 1\n" +
                "5.Mostrar características del Cubo 2\n" +
                "Poner:Salir para terminar el programa");
        do {
            a = sc.nextLine();
            switch (a) {
//crear cubo uno//
                case "1":
                    System.out.println("ancho cubo 1:");
                    ancho1 = sc.nextDouble();
                    System.out.println("alto cubo 1:");
                    alto1 = sc.nextDouble();
                    System.out.println("largo cubo 1:");
                    largo1 = sc.nextDouble();
                    System.out.println("peso cubo 1:");
                    peso1 = sc.nextInt();
                    n1 = new Cubo(ancho1, alto1, largo1, peso1);
                    break;
//crear cubo dos//
                case "2":
                    System.out.println("ancho cubo 2:");
                    ancho2 = sc.nextDouble();
                    System.out.println("alto cubo 2:");
                    alto2 = sc.nextDouble();
                    System.out.println("largo cubo 2:");
                    largo2 = sc.nextDouble();
                    System.out.println("peso cubo 2:");
                    peso2 = sc.nextInt();
                    n2 = new Cubo(ancho2, alto2, largo2, peso2);
                    break;
//mostrar volumen cubo 1//
                case "3":
                    if (n1 != null && n2 != null){
                    System.out.println("El volumen de el cubo 1 es " + n1.calularVolumen());
//mostrar volumen cubo 2//
                    System.out.println("El volumen de el cubo 2 es " + n2.calularVolumen());
            }else System.out.println("Introduce los datos del cubo 1 y 2 primero.");
                    break;
//mostrar caracteristicas cubo 1//
                case "4":
                    if (n1 != null) {
                        System.out.println("Los datos del cubo 1 es " + n1);
                    }else System.out.println("Introduce los datos del cubo 1 primero.");
                    break;
//mostrar caracteristicas cubo 2//
                case "5":
                    if (n2 != null){
                    System.out.println("Los datos del cubo 2 es " + n2);
            }else System.out.println("Introduce los datos del cubo 2 primero.");
                    break;
                case "informacion":
                    System.out.println("1.Crear cubo1 \n" +
                            "2.Crear cubo2\n" +
                            "3.Mostrar volumen del Cubo1 y del cubo2\n" +
                            "4.Mostrar características del Cubo 1\n" +
                            "5.Mostrar características del Cubo 2\n" +
                            "Poner:Salir para terminar el programa");

                    break;
            }
            if (!a.equals("informacion")) {
                System.out.println("Para ver el menu de opicones escriva informacion");
            }
        } while (!a.equals("Salir"));
    }
}