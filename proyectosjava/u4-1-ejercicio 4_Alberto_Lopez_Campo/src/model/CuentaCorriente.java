package model;

public class CuentaCorriente extends Cuenta{
private int recargo;
private float MINIMO=200;
    public CuentaCorriente(int importe, String nombre,int recargo) {
        super(importe, nombre);
        this.recargo=recargo;
    }
    public int obtenerRecargo(){
        if(getImporte()<=MINIMO){
            return getImporte()*recargo/100;
        }
        return 0;
    }
}
