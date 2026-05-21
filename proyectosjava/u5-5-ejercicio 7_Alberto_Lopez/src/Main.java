import model.Loteria;

public class Main {

    public static void main(String[] args) {

        // 1. Crear lotería
        Loteria loteria = new Loteria();

        // 2. Inicializar números
        loteria.inicializarNumeros();

        // 3. Mostrar números
        System.out.println(
                "NÚMEROS LOTERÍA:"
        );

        System.out.println(
                loteria.getNumeros()
        );

        // 4. Mostrar números premiados
        System.out.println(
                "\nNÚMEROS PREMIADOS:"
        );

        System.out.println(
                loteria.obtenerNumerosPremiados()
        );

        // 5. Eliminar 5 números
        System.out.println(
                "\nELIMINANDO 5 NÚMEROS:"
        );

        for (int i = 0; i < 5; i++) {

            System.out.println(
                    loteria.getNumeros().poll()
            );
        }

        // 6. Obtener 10 números mayor prioridad
        System.out.println(
                "\n10 NÚMEROS MAYOR PRIORIDAD:"
        );

        System.out.println(
                loteria.obtener10MayorPrioridad()
        );

        // 7. Mostrar mayor prioridad SIN eliminar
        System.out.println(
                "\nMAYOR PRIORIDAD:"
        );

        System.out.println(
                loteria.mostrarMayorPrioridad()
        );

        // 8. Vaciar lista
        loteria.vaciarLoteria();

        System.out.println(
                "\nLISTA VACÍA:"
        );

        System.out.println(
                loteria.getNumeros()
        );
    }
}
