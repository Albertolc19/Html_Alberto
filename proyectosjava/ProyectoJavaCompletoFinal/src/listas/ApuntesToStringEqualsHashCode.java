package listas;

import modelos.Persona;

public class ApuntesToStringEqualsHashCode {

    public static void ejecutar() {

        Persona p1 = new Persona("David",20);
        Persona p2 = new Persona("David",20);

        // toString
        System.out.println(p1);

        // equals
        System.out.println(p1.equals(p2));

        // hashCode
        System.out.println(p1.hashCode());
    }
}