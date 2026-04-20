//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Ejercicio 1
        int habitantesmadrid = 6464000;
        int habitantesasturias = 1042000;
        long habitantesmundo = 7_463_370_459L;
        int habitantes3 = habitantesasturias+habitantesmadrid;
        System.out.print("Habitantes de asturias mas habitantes de madrid es igual a " +habitantes3+"\nEn el mundo hay " +habitantesmundo );
        //Ejercicio 2
        float pan = 0.87F;
        float queso = 13.10f;
        float quesog = 0.15f;
        float quesofinal = queso*quesog;
        float bocadillo = pan+quesofinal;
        double hormigas = 6e100;
        System.out.print("deve pagar por el bocadillo de queso:" +bocadillo+ "\nTenemos en clase una invasión de hormigas, concretamente:" +hormigas );
        //Ejercicio 3
        boolean sorpresa=false;
        boolean opuesto=!sorpresa;
        System.out.print("\nEl valor pouesto es " +opuesto);
        //Ejercicio 4
        Byte edadjuan=20;
        int edadpedro= edadjuan+1;
        System.out.print("\nLa edad de juan es "  +edadjuan+ "la edad de pedro es " +edadpedro );
        int juan = 1980;
        int pedro = 900;
        int sumajuanpedro = juan+pedro;
        System.out.print("\nEntre los 2 ganan " +sumajuanpedro );

    }
}