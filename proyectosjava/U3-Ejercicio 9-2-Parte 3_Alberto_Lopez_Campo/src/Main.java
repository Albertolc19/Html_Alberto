//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //a:
        int num1=98765, num2=4321, num3=567;

        System.out.println(String.format("%d\n%5d\n%5d", num1, num2, num3));
//b
        double cantidad = 14.293;
        System.out.printf("Cantidad:%.4f", cantidad);
//c
        String prenda = "pantalon";
        int talla = 40;
        double precio = 34.4;
        System.out.println(String.format("\nPrenda de vestir:%s Talla:%d Precio:%5.2f euros", prenda, talla, precio));
//d
        String cadena = "Hola que tal";

        System.out.println(String.format("%.4s", cadena));
//e
        double valor = 6.6543;
        System.out.printf("%0+7.2f", valor);

    }
}