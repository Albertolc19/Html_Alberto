package model;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;

    public Juego(Jugador jugador1, Jugador jugador2, Tablero tablero) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.tablero = tablero;
    }

    public String toString() {
        return "Juego{}";
    }
    public String jugandoPartida(Jugador a1,Jugador a2,Juego a3){
        return "";
    }
}
