import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear tienda
        TiendaRopa tienda = new TiendaRopa("Mi Tienda", "Calle Mayor 1", "Oviedo");

        // Crear productos
        Calzado calzado = new Calzado("Calzado", "mallor", "garcia","nike","correr",40);
        Pantalon pantalon = new Pantalon("Pantalon", "menor", "Garcia", "Levis", "Vaquero", 100);
        Camiseta camiseta = new Camiseta("Camiseta", "normal", "Garcia", "Adidas", "Deportiva", 2);

        // Añadir productos a la tienda
        tienda.anadirProducto(calzado);
        tienda.anadirProducto(pantalon);
        tienda.anadirProducto(camiseta);

        System.out.println("Productos de la tienda:");
        tienda.mostrarProductos();

        // Reservar el pantalón con fecha actual
        pantalon.reservar();
        // Mostrar datos del pantalón tras reserva
        System.out.println("\nDatos del pantalón tras reserva:");
        System.out.println(pantalon);
        // Crear array de IReservable
        IReservable[] reservables = new IReservable[3];

        // Insertar productos reservables
        reservables[0] = pantalon;
        reservables[1] = camiseta;
        //reservables[2] = calzado; No funciona porque no es reservable.
    }
}