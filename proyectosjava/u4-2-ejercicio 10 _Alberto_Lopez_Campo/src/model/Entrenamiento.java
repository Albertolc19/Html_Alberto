package model;

public class Entrenamiento {
    public static String realizarEntrenamiento(Militar a){
        a.setResistencia(a.getResistencia()+5);
        return"El Militar ha entrenado y ha aumentado su resistencia 5 puntos";
    }
    public static String realizarEntrenamiento(Sargento a){
        if(a.getnPersonasCargo()>=20){
            a.setResistencia(a.getResistencia()+15);
            return"El Sargento ha entrenado y ha aumentado su resistencia 15 puntos";
        }
        return"El Sargento no ha podio entrenar porque no tenia las personas suficientes a cargo";
    }
    public static String realizarEntrenamiento(General a){
            a.setCapacidadMando(a.getCapacidadMando()*1.25);
            a.setResistencia(a.getResistencia()+10);
            return"El General ha entrenado y ha aumentado su resistencia 10 puntos y su capacidad de mando es ahora "+a.getCapacidadMando();
    }
    public static String realizarEntrenamiento(Soldado a){
        a.setHablidad(a.getHablidad()*1.10);
        a.setResistencia(a.getResistencia()+8);
        return"El Soldado ha entrenado y ha aumentado su resistencia 8 puntos y su habilidad es ahora "+a.getHablidad();
    }
}
