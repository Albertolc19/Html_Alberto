import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del alumno");
        String name = sc.nextLine();
        System.out.println("Apellidos del alumno");
        String apellido = sc.nextLine();
        System.out.println("Edad del alumno");
        int Edad = sc.nextInt();
        System.out.println("Nota del alumno/a en el módulo de Programación");
        Double nota1 = sc.nextDouble();
        int n1 = 1;
        System.out.println("Nota del alumno/a en el módulo de Bases de Datos");
        Double nota2 = sc.nextDouble();
        int n2 = 1;
        System.out.println("Nota del alumno/a en el módulo de Entornos de Desarrollo");
        Float nota3 = sc.nextFloat();
        int n3 = 1;
        int suma= n1+n2+n3;
        System.out.println("Nota media: "+(nota1+nota2+nota3)/suma);
        System.out.println("El alumno cuyo nombre es "+name+ " y apellidos son " +apellido+ " tiene una nota media de " +(nota1+nota2+nota3)/suma);
    }
}