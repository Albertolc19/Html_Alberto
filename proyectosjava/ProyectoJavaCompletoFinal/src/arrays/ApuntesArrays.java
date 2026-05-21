package arrays;

public class ApuntesArrays {

    public static void ejecutar() {

        // Declarar e inicializar array
        int[] numeros = {1,2,3,4,5};

        // length
        System.out.println(numeros.length);

        // for each
        for(int numero : numeros) {
            System.out.println(numero);
        }

        // Arrays multidimensionales
        int[][] matriz = {
                {1,2},
                {3,4}
        };

        System.out.println(matriz[1][0]);
    }
}