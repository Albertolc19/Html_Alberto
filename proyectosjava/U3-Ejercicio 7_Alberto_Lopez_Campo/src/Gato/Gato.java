package Gato;

public class Gato {
    private String nombre;
    private String raza;
    private String altura;
    private String peso;
    private String color;

    public Gato(String nombre, String raza, String altura, String peso, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.altura = altura;
        this.peso = peso;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}