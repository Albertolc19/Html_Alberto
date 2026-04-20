package model;

public class Criatura {
    public String nombre;
    public Double fuerza;
    public Double inteligencia;
    public Double velocidad;

    public Criatura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getFuerza() {
        return fuerza;
    }

    public void setFuerza(Double fuerza) {
        this.fuerza = fuerza;
    }

    public Double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }
public String lucha (String nombre, int media1,String nombre2, int media2){
        String ganador="";
        if(media1>media2){
        ganador=nombre;
        }else if(media1<media2) {
            ganador = nombre2;
        }else ganador="Los 2 enpatan";
        return ganador;
}
    public double media() {return 0;}
    public String comer(){
        return "Estas comiendo";
    }
    public String descansar(){
        return "Estas descansando";
    }
    public String crearArmas(){
        return"No puedes crear armas con tu persnaje";
    }
    public String utilizarArcos(){
        return "No puedes usar arcos";
    }
}
