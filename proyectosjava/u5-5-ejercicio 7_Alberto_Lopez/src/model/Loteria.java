package model;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

public class Loteria {

    // Cuanto menor sea el número mayor prioridad tendrá
    private PriorityQueue<Integer> numeros;

    // Constructor
    public Loteria() {

        numeros = new PriorityQueue<>();
    }

    // Inicializar 100 números aleatorios entre 1 y 500
    public void inicializarNumeros() {

        Random random = new Random();

        for (int i = 0; i < 100; i++) {

            numeros.add(
                    random.nextInt(500) + 1
            );
        }
    }

    // Obtener números premiados
    public ArrayList<Integer> obtenerNumerosPremiados() {

        ArrayList<Integer> premiados =
                new ArrayList<>();

        // Convertir PriorityQueue en ArrayList
        ArrayList<Integer> lista =
                new ArrayList<>(numeros);

        Random random = new Random();

        for (int i = 0; i < 5; i++) {

            int posicion =
                    random.nextInt(100);

            premiados.add(
                    lista.get(posicion)
            );
        }

        return premiados;
    }

    // Obtener 10 números de mayor prioridad
    // Los elimina de la cola
    public String obtener10MayorPrioridad() {

        String resultado = "";

        for (int i = 0; i < 10; i++) {

            resultado += numeros.poll() + " ";
        }

        return resultado;
    }

    // Mostrar elemento con mayor prioridad
    // SIN eliminarlo
    public int mostrarMayorPrioridad() {

        return numeros.peek();
    }

    // Vaciar cola
    public void vaciarLoteria() {

        numeros.clear();
    }

    // Getter
    public PriorityQueue<Integer> getNumeros() {

        return numeros;
    }
}
