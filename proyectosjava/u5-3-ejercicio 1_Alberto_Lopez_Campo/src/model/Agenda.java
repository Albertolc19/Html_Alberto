package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<String> Notas;

    public Agenda() {
        Notas=new ArrayList<String>();
    }

    public List<String> getNotas(){
        List<String> resultado = new ArrayList<>();
        for(String nota: Notas){
            resultado.add(nota);
        }
        return resultado;
    }
    public void addNota(String nota){
        Notas.add(nota);
    }
    public int getNumNotas(){
        return getNotas().size();
    }
    public String mostrarNota(int posicion){
        String resultado="";
        if(Notas.size()>posicion && posicion>=0) {
            resultado="La nota "+Notas.get(posicion)+" se  encuentra en la posicion "+posicion;
        }else resultado="Posición "+posicion+" incorrecta.";
        return resultado;
    }
    public String borrarNota(int posicion){
        String resultado="";
        if(Notas.size()>posicion && posicion>=0) {
            Notas.remove(posicion);
            resultado="La nota "+posicion+" se ha borrado correctamente";
        }else resultado="Posición "+posicion+" incorrecta.";
        return resultado;
    }
}
