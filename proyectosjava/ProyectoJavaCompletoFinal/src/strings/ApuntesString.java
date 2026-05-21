package strings;

public class ApuntesString {

    public static void ejecutar() {

        // Inmutabilidad String
        String s = "Java";
        s.concat(" Rules");

        // El String original NO cambia
        System.out.println(s);

        // Se crea un nuevo objeto
        s = s.concat(" Rules");

        System.out.println(s);

        // Métodos importantes
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(0));
        System.out.println(s.substring(0, 4));
        System.out.println(s.replace("Java", "Hola"));

        // Comparación
        System.out.println(s.equals("Java Rules"));
    }
}