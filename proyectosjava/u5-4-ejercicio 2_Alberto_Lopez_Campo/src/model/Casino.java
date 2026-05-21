package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Casino {
    private String nombre;
    private String direccion;
    private List<Juego> juegos= new ArrayList<>();

    public Casino(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public void anadirJuegos(Juego a){
        juegos.add(a);
    }
    public List<Juego> seleccionarJuegos(Juego j){
        List<Juego> resultado=new ArrayList<>();
        for(Juego juego: juegos){
           if(juego.equals(j)){
               resultado.add(juego);
           }
        }
        return resultado;
    }

    public List<Juego> mostrarJuegos(){
        List<Juego> resultado=new ArrayList<>();
        for(Juego juego:juegos){
            resultado.add(juego);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Casino{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", juegos=" + mostrarJuegos() +
                '}';
    }
}

