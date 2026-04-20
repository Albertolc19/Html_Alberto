package model;

import java.util.Date;

public class Camiseta extends Producto implements IReservable {
    private int numBolsos;
    private boolean reservado;
    private Date fecha;

    public Camiseta(String nombre, String direccion, String ciudad, String marca, String tipo, int numBolsos) {
        super(nombre, direccion, ciudad, marca, tipo);
        this.numBolsos = numBolsos;
        this.reservado = false;
    }

    @Override
    public String reservar() {
        if(reservado) {
            return "La camiseta ya estaba reservada";
        }else{
            fecha= new Date();
            reservado=true;
            return "Se reservo la camiseta exitosamente";
        }
    }
}
