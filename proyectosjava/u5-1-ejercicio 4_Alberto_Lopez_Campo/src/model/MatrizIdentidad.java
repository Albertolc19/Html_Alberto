package model;

public class MatrizIdentidad {
    int[][] matriz;
    public MatrizIdentidad() {
    }
    public int[][] generarMatrizIdentidad(int dimension){
        int[][] matriz = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {

                if (i == j) {
                    matriz[i][j] = 1; // diagonal
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }
    public String mostrarMatriz(int[][] matriz) {
        String resultado="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado+=matriz[i][j] + " ";
            }
            resultado+="\n";
        }
        return resultado;
    }

}
