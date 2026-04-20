package model;

import java.time.LocalDate;

public class Perro extends Animal{
private String lugarFavorito;
    public Perro(String nombre, int anioNacimiento, int nPatas, Persona duenio, String lugarFavorito) {
        super(nombre, anioNacimiento, nPatas, duenio);
        this.lugarFavorito=lugarFavorito;
    }

    @Override
    public String toString() {
        return super.toString() +
                "lugarFavorito='" + lugarFavorito + '\'' +
                '}';
    }

    @Override
    public String emitirSonido() {
        return "guau";
    }

    @Override
    public String comer() {
        return "comer huesos";
    }

}
