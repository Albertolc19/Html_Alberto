package model;

import java.util.Arrays;

public class Calzado extends Producto{
    int[] tallas=new int[2];

    public Calzado(String nombre, String direccion, String ciudad, String marca, String tipo, int talla) {
        super(nombre, direccion, ciudad, marca, tipo);
        this.tallas[0]=talla;
        conseguirLetra();
    }

    private void conseguirLetra(){
        if(tallas[0]>=35&&tallas[0]<=38){
            tallas[1]='S';
        } else if (tallas[0]>=39&&tallas[0]<=42) {
            tallas[1]='M';
        } else if (tallas[0]>=43&&tallas[0]<=46) {
            tallas[1]='L';
        } else if (tallas[0]>=47&&tallas[0]<=50) {
            tallas[1]='X';
        }
    }

    @Override
    public String toString() {
        return "Calzado{" +
                "tallas=" + "[" + tallas[0] + ", " + (char)tallas[1] + "]" +
                '}';
    }
}
