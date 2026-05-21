package listas;

import java.util.ArrayList;

public class ApuntesArrayList {

    public static void ejecutar() {

        ArrayList<String> nombres = new ArrayList<>();

        // add
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        // add(index)
        nombres.add(1, "Pedro");

        // get
        System.out.println(nombres.get(0));

        // contains
        System.out.println(nombres.contains("Luis"));

        // remove
        nombres.remove("Ana");

        // size
        System.out.println(nombres.size());

        // foreach
        nombres.forEach(System.out::println);
    }
}