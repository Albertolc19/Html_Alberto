package model;

import java.util.Date;

public class Revista extends Publicacion{
    private Date fechaPublicaion;

    public Revista(int anio, String nombre) {
        super(anio, nombre);
        this.fechaPublicaion = new Date();
    }
    public String publicar(){
        return"La revista se ha publicado en la fecha "+fechaPublicaion;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "fechaPublicaion=" + fechaPublicaion +
                '}';
    }
}
