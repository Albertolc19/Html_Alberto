package model;

public class Calzado extends Producto{
    int[] tallas;

    public Calzado(String nombre, String direccion, String ciudad, String marca, String tipo, int[] tallas) {
        super(nombre, direccion, ciudad, marca, tipo);
        this.tallas = tallas;
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
}
