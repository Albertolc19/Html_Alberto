import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> salarios = new ArrayList<>(List.of(2500, 3200, 2800, 4000, 3100, 2900));
        if (salarios.stream().findFirst().isPresent()) {
            System.out.println(salarios.stream().findFirst());
        } else System.out.println("No hay salarios");
        System.out.println(salarios.stream().min(Integer::compareTo).orElse(0));
        System.out.println(salarios.stream().max(Integer::compareTo).orElse(0));
        System.out.println(salarios.stream().mapToInt(Integer::intValue).average().orElse(0));
        System.out.println(salarios.stream().mapToInt(Integer::intValue).filter(n -> n > 3000).count());
        if (salarios.stream().allMatch(n -> n >= 2500)) {
            System.out.println("Todos los salarios son mayores o iguales a 2500");
        } else System.out.println("no son mayores de 2500 f");
        if (salarios.stream().anyMatch(n -> n < 2600)) {
            System.out.println("Algunos ganan menos de 2600");
        } else System.out.println("nadie gana menos de 2600");
        System.out.println("Salarios distintos: " + salarios.stream().distinct().toList());
        System.out.println("Salarios distintos: " + salarios.stream().distinct().sorted().toList());
    }
}