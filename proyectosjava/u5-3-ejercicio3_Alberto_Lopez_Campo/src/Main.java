import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(7);
        notas.add(4);
        notas.add(9);
        notas.add(6);
        notas.add(8);
        if (notas.stream().findFirst() != null) {
            System.out.println("Primera nota: " + notas.stream().findFirst().orElse(0));
        } else System.out.println("No hay notas en la lista");
        System.out.println("Nota mas baja: " + notas.stream().min(Integer::compareTo).orElse(0));
        System.out.println("Nota maxima: " + notas.stream().max(Integer::compareTo).orElse(0));
        System.out.println("Nota media: " + notas.stream().mapToInt(Integer::intValue).average().orElse(0));
    int[] numeros = {5,2,10,4,6};
        if (Arrays.stream(numeros).findFirst() != null) {
            System.out.println("Primera nota: " + Arrays.stream(numeros).findFirst().orElse(0));
        } else System.out.println("No hay notas en la lista");
        System.out.println("Nota mas baja: " + Arrays.stream(numeros).min().orElse(0));
        System.out.println("Nota maxima: " + Arrays.stream(numeros).max().orElse(0));
        System.out.println("Nota media: " + Arrays.stream(numeros).average().orElse(0));
    }
}