package model;

public class Damas extends Juego{
    private int blancas;
    private int negras;

    public Damas(Jugador jugador1, Jugador jugador2, Tablero tablero, int blancas, int negras) {
        super(jugador1, jugador2, tablero);
        this.blancas = blancas;
        this.negras = negras;
    }

    @Override
    public String toString() {
        return "blancas=" + blancas +
                "y negras=" + negras +
                '.';
    }

    @Override
    public String jugandoPartida(Jugador a1,Jugador a2,Juego a3){
        String retornar="";
        if(a1.getPuntuacion()>a2.getPuntuacion()){
            retornar="El jugador "+a1.getNombre()+" gano al jugador "+a2.getNombre()+" en el juego de damas cuyo número de "+a3;
        }else if(a2.getPuntuacion()>a1.getPuntuacion()){
            retornar="El jugador "+a2.getNombre()+" gano al jugador "+a1.getNombre()+" en el juego de damas cuyo número de "+a3;
        }else retornar="han enpatado";
        return retornar;
    }
}
