import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nUsuario;
        String aUsuario;
        String nComapñia;
        String ciuCompañia;
        String tDVD;
        String aTitulo;
        String aTitulo2;
        String aTitulo3;
        int aEdad;
        int aEdad2;
        int aEdad3;
        int eUsuario;
        int pCD;
        int vBlueRay;
        int cBlueRay;
        System.out.println("Dime titulo del articulo 1:");
        aTitulo=sc.nextLine();
        System.out.println("Dime la edad del articulo 1:");
        aEdad=sc.nextInt();
        sc.nextLine();
        Articulos Cd=new Articulos(aTitulo,aEdad);
        System.out.println("Dime el nombre del usuario:");
        nUsuario=sc.nextLine();
        System.out.println("Dime el apellido del usuario:");
        aUsuario=sc.nextLine();
        System.out.println("Dime la edad del usuario:");
        eUsuario=sc.nextInt();
        System.out.println("Dime las pistas del CD:");
        pCD=sc.nextInt();
        Autor autor = new Autor(nUsuario, aUsuario, eUsuario);
        CD cd = new CD(aTitulo,aEdad,pCD,autor);
        sc.nextLine();
        System.out.println("Dime titulo del articulo 2:");
        aTitulo2=sc.nextLine();
        System.out.println("Dime la edad del articulo 2:");
        aEdad2=sc.nextInt();
        sc.nextLine();
        System.out.println("Dime el nombre de la compañia:");
        nComapñia=sc.nextLine();
        System.out.println("Dime la ciudad de la comañia:");
        ciuCompañia=sc.nextLine();
        Compañia compañia = new Compañia(nComapñia, ciuCompañia);
        System.out.println("Dime el tipo del CD:");
        tDVD=sc.nextLine();
        DVD dvd = new DVD(aTitulo2,aEdad2,tDVD,compañia);
        sc.nextLine();
        System.out.println("Dime titulo del articulo 3:");
        aTitulo3=sc.nextLine();
        System.out.println("Dime la edad del articulo 3:");
        aEdad3=sc.nextInt();
        sc.nextLine();
    System.out.println("Dime la velocidad del BlueRay:");
        vBlueRay=sc.nextInt();
        System.out.println("Dime la capacidad del BlueRay");
        cBlueRay=sc.nextInt();
        BlueRay blueRay = new BlueRay(aTitulo3,aEdad3,vBlueRay, cBlueRay);
        System.out.println(cd);
        System.out.println(dvd);
        System.out.println(blueRay);
    }
}