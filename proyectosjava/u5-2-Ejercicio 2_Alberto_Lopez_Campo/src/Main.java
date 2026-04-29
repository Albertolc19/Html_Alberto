import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] equipo={"David", "Sergio", "Manuel", "Juan", "Pepe"};
        System.out.println("Ordenado Ascendente:");
        Arrays.sort(equipo);
        for(String i: equipo){
            System.out.println(i+", ");
        }
        System.out.println("Ordenado Descendente:");
        Arrays.sort(equipo, Collections.reverseOrder());
        for(String i: equipo){
            System.out.println(i+", ");
        }
        Integer[] numAleatorios=new Integer[10];
        for(int i=0;i<numAleatorios.length;i++) {
            numAleatorios[i] = (int) ((Math.random() * 100) + 1);
        }
        Arrays.sort(numAleatorios);
        System.out.println("Ordenado Ascendente:");
        for(int i: numAleatorios){
            System.out.println(i+", ");
        }
        System.out.println("Ordenado Descendente:");
        Arrays.sort(numAleatorios, Collections.reverseOrder());
        for(int i: numAleatorios){
            System.out.println(i+", ");
        }
    }
}