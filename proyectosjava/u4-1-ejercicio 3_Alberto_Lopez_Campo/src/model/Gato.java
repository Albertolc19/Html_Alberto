package model;

public class Gato extends Animal{

    public Gato(String nombre, int altura, int peso) {
        super(nombre, altura, peso);
    }

    public String comer(){
        return "el gato esta comiendo";
    }
}
