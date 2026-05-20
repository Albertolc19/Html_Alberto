package model;

public class Propagacion {
    public String revertir(String palabra) {
        if (palabra.length() == 0) {
            throw new IllegalArgumentException("El String no puede estar vacío.");
        }
        return new StringBuilder(palabra).reverse().toString();
    }
}
