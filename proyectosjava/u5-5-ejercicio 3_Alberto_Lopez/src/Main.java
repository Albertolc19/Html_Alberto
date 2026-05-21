import model.Alimento;
import model.Restaurante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // 1. Crear restaurante
        Restaurante restaurante = new Restaurante("Marganta");

        // 2. Crear 5 alimentos
        // Dos tendrán el mismo precio

        Alimento a1 = new Alimento(
                "Pizza",
                12.5
        );

        Alimento a2 = new Alimento(
                "Hamburguesa",
                9.5
        );

        Alimento a3 = new Alimento(
                "Ensalada",
                15
        );

        Alimento a4 = new Alimento(
                "Pasta",
                15
        );

        Alimento a5 = new Alimento(
                "Agua",
                2
        );

        // 3. Añadir alimentos al restaurante
        restaurante.addAlimento(a1);
        restaurante.addAlimento(a2);
        restaurante.addAlimento(a3);
        restaurante.addAlimento(a4);
        restaurante.addAlimento(a5);

        // 4. Buscar alimentos con mismo precio
        System.out.println(
                "ALIMENTOS CON PRECIO 15:"
        );

        for (Alimento alimento :
                restaurante.buscarPorPrecio(15)) {

            System.out.println(alimento);
        }

        // 5. Buscar alimento por nombre
        System.out.println(
                "\nBUSCAR POR NOMBRE:"
        );

        System.out.println(
                restaurante.buscarAlimento("Pizza")
        );

        // 6. Mostrar alimentos más caros
        System.out.println(
                "\nALIMENTOS MÁS CAROS:"
        );

        for (Alimento alimento :
                restaurante.obtenerMasCaros()) {

            System.out.println(alimento);
        }

        // 7. Mostrar alimento más barato
        System.out.println(
                "\nALIMENTO MÁS BARATO:"
        );

        System.out.println(
                restaurante.obtenerMasBarato()
        );

        // 8. Mostrar media precios
        System.out.println(
                "\nMEDIA PRECIOS:"
        );

        System.out.println(
                restaurante.mediaPrecios()
        );
    }
}
