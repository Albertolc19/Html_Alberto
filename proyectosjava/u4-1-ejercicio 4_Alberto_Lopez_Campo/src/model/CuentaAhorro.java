package model;

public class CuentaAhorro extends Cuenta{
private int interes=12;

    public CuentaAhorro(int importe, String nombre) {
        super(importe, nombre);
    }
    public int obtenerInteres(){
        return getImporte()*interes/100;
    }


}
