package model;

public class TiendaRopa extends Tienda{
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
        String resultado="El arraybestá lleno";
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
}
