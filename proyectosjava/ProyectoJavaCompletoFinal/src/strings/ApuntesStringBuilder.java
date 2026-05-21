package strings;

public class ApuntesStringBuilder {

    public static void ejecutar() {

        StringBuilder sb = new StringBuilder("Java");

        // append
        sb.append(" Rules");

        // insert
        sb.insert(0, "Hola ");

        // delete
        sb.delete(0, 5);

        // reverse
        System.out.println(sb.reverse());

        // toString
        System.out.println(sb.toString());
    }
}