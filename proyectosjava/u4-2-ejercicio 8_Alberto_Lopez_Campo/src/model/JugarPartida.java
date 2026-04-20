package model;

public class JugarPartida {
    public String jugandoPartidaAjedrez(Jugador a1,Jugador a2){
        String retornar="";
        if(a1.getPuntuacion()>a2.getPuntuacion()){
            retornar="El jugador "+a1.getNombre()+"gano al jugador"+a2.getNombre()+"en el juego de ajedrez cuyo número de"+a1;
        }else if(a2.getPuntuacion()>a1.getPuntuacion()){
            retornar="El jugador "+a2.getNombre()+"gano al jugador"+a1.getNombre()+"en el juego de ajedrez cuyo número de"+a2;
        }else retornar="han enpatado";

return retornar;
    }
}
