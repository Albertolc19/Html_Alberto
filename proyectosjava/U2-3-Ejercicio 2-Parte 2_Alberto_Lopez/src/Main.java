import java.util.Scanner;
public class Main {
    public static Double calcularHipotenusa(double n1, double n2){
        double hipotenusa=0;
        hipotenusa= n1*n1+n2*n2 ;
        return Math.sqrt(hipotenusa);
    }
    public static String empezar(double n1, double n2){
        double hipotenusa=0;
        hipotenusa=calcularHipotenusa(n1, n2);
        return "La hipotenusa es "+hipotenusa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cateto =0;
        double cateto2=0;
        System.out.println("Introduce un cateto de el triangulo rectangulo por favor");
        cateto= sc.nextDouble();
        System.out.println("Introduce el otro cateto de el triangulo rectangulo por favor");
        cateto2= sc.nextDouble();
        System.out.println(empezar(cateto, cateto2));
    }
}