import model.CuentaCorriente;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaCorriente alberto = new CuentaCorriente(300, "alberto", 31);
        System.out.println(alberto);
        //Integrar dinero
        alberto.integrar(200);
        System.out.println(alberto);
        //Reintegrar dinero
        alberto.reintegrar(100);
        System.out.println(alberto);
        System.out.println("El recargo es de= " + alberto.obtenerRecargo());
        System.out.println(alberto);
    }
}