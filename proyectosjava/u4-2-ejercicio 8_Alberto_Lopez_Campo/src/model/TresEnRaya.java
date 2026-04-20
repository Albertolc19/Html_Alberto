package model;

public class TresEnRaya extends Juego {
    int numeroMovimientos;

    public TresEnRaya(Jugador jugador1, Jugador jugador2, Tablero tablero) {
        super(jugador1, jugador2, tablero);
        numeroMovimientos = (int) (Math.random() * 10) + 1;
    }

    @Override
    public String jugandoPartida(Jugador a1, Jugador a2, Juego a3) {
        String retornar = "";
        int jugador1 = 0;
        int jugador2 = 0;
        for (int i = 0; i < numeroMovimientos; i++) {
            retornar += "Movimiento" + i + ": Jugador 1- Puntuación:" + a1.getPuntuacion() + " Jugador2-Puntuación " + a2.getPuntuacion() + "\n";
            if (a1.getPuntuacion() > a2.getPuntuacion()) {
                retornar += "Jugador1 suma 1 punto\n";
                jugador1++;
            } else {
                retornar += "Jugador2 suma 1 punto\n";
                jugador2++;
            }
            a1.setPuntuacion((int) (Math.random() * 10) + 1);
            a2.setPuntuacion((int) (Math.random() * 10) + 1);
        }
        if (jugador1 > jugador2) {
            retornar += "El Jugador 1 con un total de " + jugador1 + " puntos ha ganado al Jugador 2 con un total de " + jugador2 + " puntos.";
        } else if (jugador1 < jugador2) {
            retornar += "El Jugador 2 con un total de " + jugador2 + " puntos ha ganado al Jugador 1 con un total de " + jugador1 + " puntos.";
        } else {
            retornar += "Se ha producido un empate";
        }
        return retornar;
    }
}
