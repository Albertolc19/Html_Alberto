package model;

import java.time.LocalDate;

public class Vaca extends Animal{
    public Vaca(String nombre, int anioNacimiento, int nPatas, Persona duenio) {
        super(nombre, anioNacimiento, nPatas, duenio);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String emitirSonido() {
        return "muu";
    }

    @Override
    public String comer() {
        return "comer hierba";
    }
}
