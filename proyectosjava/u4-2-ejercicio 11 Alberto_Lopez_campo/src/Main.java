
import model.Fruta;
import model.Producto;
import model.Herrameinta;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce ID del producto: ");
        int id = sc.nextInt();

        System.out.println("-- CASOS CON NOMBRE --");

        /* 1
         Crea un Producto cuyo tipo de Referencia sea Producto
         y el tipo de la instancia del Objeto sea Producto.
         ¿Qué se muestra por consola? El producto independientemente de su tipo y cuyo nombre es david se ha registrado correctamente.
         ¿Qué metodo se está invocando? El de producto.
         */
        Producto producto = new Producto(nombre);
        System.out.println(producto.registrar());
        /* 2
         Crea un Producto cuyo tipo de Referencia sea Fruta
         y el tipo de la instancia del Objeto sea Fruta.
         ¿Qué se muestra por consola? La fruta cuyo nombre es david se ha registrado correctamente.
         ¿Qué metodo se está invocando? El de Fruta.
         */
        Fruta fruta = new Fruta(nombre);
        System.out.println(fruta.registrar());

        /* 3
         Crea un Producto cuyo tipo de Referencia sea Producto
         y el tipo de la instancia del Objeto sea Herramienta.
         ¿Qué se muestra por consola? La herramienta cuyo nombre es david se ha registrado correctamente.
         ¿Qué metodo se está invocando? El de Herrameinta.
         */
        Producto herrameinta = new Herrameinta(nombre);
        System.out.println(herrameinta.registrar());

        /* 4
         Crea un Producto cuyo tipo de Referencia sea Producto
         y el tipo de la instancia del Objeto sea Fruta.
         ¿Qué se muestra por consola? La fruta cuyo nombre es david se ha registrado correctamente.
         ¿Qué metodo se está invocando? El de producto.
         */
        Producto fruta1 = new Fruta(nombre);
        System.out.println(fruta1.registrar());

        System.out.println("----- CASOS CON ID -----");
        /* 5
         Invoca el registrarProducto con un número identificador solicitado al usuario.
         Crea un Producto cuyo tipo de Referencia sea Fruta
         y el tipo de la instancia del Objeto sea Fruta.
         ¿Qué se muestra por consola? Error
         ¿Qué metodo se está invocando? Funcionaria.
         */
        Fruta fruta2 = new Fruta(nombre);
        System.out.println(fruta2.registrar(id));

        /* 6
         Invoca el registrarProducto con un número identificador solicitado al usuario.
         Crea un Producto cuyo tipo de Referencia sea Producto
         y el tipo de la instancia del Objeto sea Producto.
         ¿Qué se muestra por consola? Error
         ¿Qué metodo se está invocando? Nada proque no sepuede hacer proque no se puede juntar oberride con sobreescritura de metodos.
         */
        Producto producto1 = new Producto(nombre);
        //System.out.println(producto1.registrar(id));

        /* 7
         Invoca el registrarProducto con un número identificador solicitado al usuario.
         Crea un Producto cuyo tipo de Referencia sea Producto
         y el tipo de la instancia del Objeto sea Fruta.
         ¿Qué se muestra por consola? Error
         ¿Qué metodo se está invocando? Nada proque no sepuede hacer proque no se puede juntar oberride con sobreescritura de metodos.
         */
        Producto fruta3 = new Fruta(nombre);
        //System.out.println(fruta3.registrar(id));
        //Si pusieras una furta se podria ya que no haria oberride.
    }
}