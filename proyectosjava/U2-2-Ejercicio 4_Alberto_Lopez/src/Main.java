import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        boolean a=true;
        System.out.print("Introduce el número del mes en el que estas: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año en el que estas: ");
        int anio = sc.nextInt();
        int diasmes= 0;
        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
            diasmes= 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
            diasmes= 30;
                break;
            case 2: // Febrero
                if (anio%4 == 0){
                    diasmes=29;
                }
                else{
                    diasmes=28;
                }
                break;
            default:
                System.out.println("Mes no válido.");
                a=false;
        }
        if ( a==true)System.out.println("Estamos en el año "+anio+" y tiene " +diasmes+ " dias.");

    }
}