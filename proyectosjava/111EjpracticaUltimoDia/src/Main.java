import model.Fruta;
import model.Producto;
import model.Ropa;
import model.Supermercado;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto p1= new Fruta("Portátil Asus", 799,23);
        Producto p2= new Fruta("Ratón Logitech", 45,44);
        Producto p3= new Ropa("Teclado Mecánico", 89,"esc");
        Producto p4= new Ropa("Monitor 24'' Dell", 149,"man");
        Producto p5= new Ropa("Auriculares Sony", 120,"pep");
        Supermercado supermercado=new Supermercado("Lidel","paz");
        List<Producto> lisProductos=supermercado.getProductos();
        supermercado.addProducto(p1);
        supermercado.addProducto(p2);
        supermercado.addProducto(p3);
        supermercado.addProducto(p4);
        supermercado.addProducto(p5);
        System.out.println(supermercado.mostrarEstadisticas());
        System.out.println("Calcular iva:");
        for(Producto p: lisProductos){

            System.out.println("El precio con iva del producto "+p.getNombre()+" es: "+p.calcularIva());
        }
    }
}