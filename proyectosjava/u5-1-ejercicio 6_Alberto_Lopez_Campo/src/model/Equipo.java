package model;

import java.util.Arrays;

public class Equipo {
    private String nombre;
    private String ciudad;
    private Jugador[] jugadores;

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = new Jugador[5];
    }
    public Jugador[] getJugadores() {
        return jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                "\n" + "jugadores=" + Arrays.toString(jugadores) +
                '}';
    }

}
