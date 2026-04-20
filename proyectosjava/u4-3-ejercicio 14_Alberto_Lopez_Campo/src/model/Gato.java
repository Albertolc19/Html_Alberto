package model;

import java.time.LocalDate;

public class Gato extends Animal{
    private String juguetePreferido;

    public Gato(String nombre, int anioNacimiento, int nPatas, Persona duenio, String juguetePreferido) {
        super(nombre, anioNacimiento, nPatas, duenio);
        this.juguetePreferido = juguetePreferido;
    }

    @Override
    public String toString() {
        return super.toString() +
                "juguetePreferido='" + juguetePreferido + '\'' +
                '}';
    }

    @Override
    public String emitirSonido() {
        return "miau";
    }

    @Override
    public String comer() {
        return "comer pescado";
    }

}
