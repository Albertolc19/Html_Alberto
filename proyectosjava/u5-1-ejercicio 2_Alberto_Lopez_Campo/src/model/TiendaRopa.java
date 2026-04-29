package model;

import java.util.Arrays;

public class TiendaRopa {
    private String nombre;
    private String direccion;
    private String ciudad;
    Producto[] productos=new Producto[100];

    public TiendaRopa(String nombre, String direccion, String ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    public String AnadirProducto(Producto a){
        String resultado="El array esta lleno";
        int numProducto=0;
        for (int i=0; i< productos.length;i++){
            if(productos[i] == null){
                productos[i]=a;
                resultado="El producto se ha añadido";
                break;
            }
        }
        return resultado;
    }
    @Override
    public String toString() {
        return "TiendaRopa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", productos=" + Arrays.toString(productos) +
                '}'+"\n";
    }
    public String mostrarProductos(){
        String resultado="";
        for(int i=0;i< productos.length;i++) {
            resultado +=i+": "+toString();
        }
        return resultado;
    }
}
