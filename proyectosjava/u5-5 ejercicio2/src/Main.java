//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Crear array estático
        String[] modulos = {
                "Programación",
                "Bases de Datos",
                "Entornos de Desarrollo",
                "Lenguaje de Marcas",
                "Sistemas Informáticos"
        };

        // 2. Mostrar contenido del array
        System.out.println("ARRAY ORIGINAL:");

        for (String modulo : modulos) {
            System.out.println(modulo);
        }

        // 3. Copiar array dentro de una lista
        List<String> listaModulos =
                new ArrayList<>(Arrays.asList(modulos));

        // 4. Cambiar módulos usando set()

        listaModulos.set(
                0,
                "Programación Entorno Servidor"
        );

        listaModulos.set(
                1,
                "Programación Entorno Cliente"
        );

        listaModulos.set(
                2,
                "Diseño de Interfaces"
        );

        // 5. Mostrar contenido de la lista
        System.out.println("\nLISTA MODIFICADA:");

        for (String modulo : listaModulos) {
            System.out.println(modulo);
        }

        // 6. Mostrar contenido del array original
        System.out.println("\nARRAY ORIGINAL DESPUÉS:");

        for (String modulo : modulos) {
            System.out.println(modulo);
        }
    }
}
