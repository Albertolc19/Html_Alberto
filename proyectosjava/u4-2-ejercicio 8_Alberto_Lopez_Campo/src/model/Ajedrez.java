package model;

public class Ajedrez extends Juego{
    private int peones;
    private int figuras;

    public Ajedrez(Jugador jugador1, Jugador jugador2, Tablero tablero, int peones, int figuras) {
        super(jugador1, jugador2, tablero);
        this.peones = peones;
        this.figuras = figuras;
    }

    @Override
    public String toString() {
        return "peones=" + peones +
                ", figuras=" + figuras+".";
    }

    @Override
    public String jugandoPartida(Jugador a1,Jugador a2 ,Juego a3){
        String retornar="";
        if(a1.getPuntuacion()>a2.getPuntuacion()){
            retornar="El jugador "+a1.getNombre()+" gano al jugador "+a2.getNombre()+" en el juego de ajedrez cuyo número de "+a3.toString();
        }else if(a2.getPuntuacion()>a1.getPuntuacion()){
            retornar="El jugador "+a2.getNombre()+" gano al jugador "+a1.getNombre()+" en el juego de ajedrez cuyo número de "+a3.toString();
        }else retornar="han enpatado";
        return retornar;
    }
}
