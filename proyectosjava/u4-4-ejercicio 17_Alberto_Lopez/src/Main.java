import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// 1 Crear instancia de Lista
        //Lista lista = new Lista();
//Esto no funciona, ya que no se puede crear una instancia de una clase interfaz, ya que es abstracta
        // 2 Crear instancia de Producto
        // Producto producto = new Producto();  No es posible porque es abstracta

        // 3 Crear instancia de Raqueta
        // Raqueta raqueta = new Raqueta();  No es posible porque es abstracta

        // 4 Crear PingPong con referencia Producto
        Producto pingPong = new PingPong();

        // 5 Crear Paddel con referencia Raqueta
        Raqueta paddel = new Paddel();

        // 6 Crear Tenis con referencia Lista
        // Lista tenis = new Tenis();  No es posible porque Tenis no es Lista sino su padre

        // Crear objetos para probar
        PingPong pingPong1 = new PingPong();
        Paddel paddel1 = new Paddel();
        Tenis tenis1 = new Tenis();

        // 7 Probar métodos
        System.out.println("=== METODOS ===");
        System.out.println(pingPong1.probar());
        System.out.println(pingPong1.sacar());
        System.out.println(pingPong1.vender());
        System.out.println(pingPong1.borrar());
        System.out.println(pingPong1.insertar());
        System.out.println(pingPong1.recorrer());

        System.out.println(paddel1.probar());
        System.out.println(paddel1.sacar());
        System.out.println(paddel1.vender());
        System.out.println(paddel1.borrar());
        System.out.println(paddel1.insertar());
        System.out.println(paddel1.recorrer());

        System.out.println(tenis1.probar());
        System.out.println(tenis1.sacar());
        System.out.println(tenis1.vender());
        System.out.println(tenis1.borrar());
        System.out.println(tenis1.insertar());
        System.out.println(tenis1.recorrer());

    }
}