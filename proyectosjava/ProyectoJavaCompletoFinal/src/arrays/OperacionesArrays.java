package arrays;

import java.util.Arrays;

public class OperacionesArrays {

    public static void ejecutar() {

        int[] numeros = {5,2,8,1};

        // Ordenar
        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));

        // Búsqueda lineal
        int buscado = 8;

        for(int numero : numeros) {
            if(numero == buscado) {
                System.out.println("Encontrado");
            }
        }
    }
}