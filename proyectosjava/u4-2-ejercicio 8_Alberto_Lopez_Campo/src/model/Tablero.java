package model;

public class Tablero {
    int filas;
    int columnas;

    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    @Override
    public String toString() {
        return "Tablero{" +
                "filas=" + filas +
                ", columnas=" + columnas +
                '}';
    }
}
