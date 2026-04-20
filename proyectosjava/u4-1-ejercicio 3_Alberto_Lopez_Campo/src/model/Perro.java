package model;

public class Perro extends Animal{
    public Perro(String nombre, int altura, int peso) {
        super(nombre, altura, peso);
    }

    public String correr(){
        return "el perro esta corriendo";
    }
}
