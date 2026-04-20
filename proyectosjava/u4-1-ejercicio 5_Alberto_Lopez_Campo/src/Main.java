import model.Aula;
import model.AulaTaller;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String nombre="";
        int pupitres=0;
        int ordenadores=0;
        String texUsuario="";
        System.out.print("Menu\n");
        System.out.println("1.Crear aula\n2.Crear aulaTaller\n3.Caracteristicas aula\n4.Caracteristicas aulaTaller\nSalir");
        Aula a1=null;
        AulaTaller t1=null;
        do {
            System.out.println("Introduce la accion a realizar(Si quieres ver el menu escrive menu)");
            texUsuario=sc.nextLine();
            switch (texUsuario) {
                case "menu":
                    System.out.println("1.Crear aula\n2.Crear aulaTaller\n3.Caracteristicas aula\n4.Caracteristicas aulaTaller\nSalir");
                    break;
                case "1":
                    System.out.println("Introduce el nombre de el aula");
                    nombre=sc.nextLine();
                    System.out.println("Introduce los pupitres");
                    pupitres=sc.nextInt();
                    sc.nextLine();
                    a1=new Aula(nombre,pupitres);
                    break;
                case "2":
                    System.out.println("Introduce el nombre de el aulaTaller");
                    nombre=sc.nextLine();
                    System.out.println("Introduce los pupitres del aulaTaller");
                    pupitres=sc.nextInt();
                    System.out.println("Introduce los ordenadores del aulaTaller");
                    ordenadores=sc.nextInt();
                    sc.nextLine();
                    t1=new AulaTaller(nombre,pupitres,ordenadores);
                    break;
                case "3":
                    if(a1!=null) {
                        System.out.println("Los datos del aula son : " + a1);
                    }else System.out.println("Introduce los datos primero, Gracias");
                    break;
                case "4":
                    if(t1!=null) {
                        System.out.println("Los datos del aulaTaller son : " + t1);
                    }else System.out.println("Introduce los datos primero, Gracias");
                    break;
            }
        } while (!"Salir".equals(texUsuario));
    }
}