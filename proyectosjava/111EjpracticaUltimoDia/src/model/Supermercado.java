package model;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String nombre;
    private String direccion;
    private List<Producto> productos;

    public Supermercado(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        productos=new ArrayList<>();
    }
    public void addProducto(Producto a){
        productos.add(a);
    }
    public String mostrarEstadisticas(){
        Producto proMayor=new Fruta("pru1",0,23);
        Producto proMenor=new Ropa("pru2",100000,"jos");
        int sumPrecios=0;
        int media=0;
        for(Producto p: productos){
        sumPrecios+= p.getPrecio();
        if(proMayor.getPrecio()<p.getPrecio()){
            proMayor=p;
        }
        if(proMenor.getPrecio()>p.getPrecio()){
            proMenor=p;
        }
        }
        media=sumPrecios/productos.size();
        return "La suma es: "+sumPrecios+"\nLa media es: "+media+" \nEl producto con el precio mayor es: "+proMayor.toString()+"\nEl producto menor es: "+proMenor.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
