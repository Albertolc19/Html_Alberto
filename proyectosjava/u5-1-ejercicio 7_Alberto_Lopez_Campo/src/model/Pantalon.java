package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pantalon extends Producto implements IReservable{
    private int longitud;
    private boolean reservado;
    private Date fecha;

    public Pantalon(String nombre, String direccion, String ciudad, String marca, String tipo, int longitud) {
        super(nombre, direccion, ciudad, marca, tipo);
        this.longitud = longitud;
        this.reservado = false;
    }
    @Override
    public String reservar() {
        if(reservado) {
            return "El pantalon ya estaba reservado";
        }else{
            fecha= new Date();
            reservado=true;
            return "Se reservo el pantalon exitosamente";
        }
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "longitud=" + longitud +
                ", reservado=" + reservado +
                ", fecha=" + fecha +
                '}';
    }
}
