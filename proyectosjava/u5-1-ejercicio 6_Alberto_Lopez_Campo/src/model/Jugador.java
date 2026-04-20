package model;

public class Jugador {
    int numero;
    String nombre;
    double altura;
    double peso;
    int edad;
    String posicion;

    public Jugador(int numero, String nombre, double altura, double peso, int edad, String posicion) {
        this.numero = numero;
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", edad=" + edad +
                ", posicion='" + posicion + '\'' +
                '}'+"\n";
    }
}
