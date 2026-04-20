import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String cadena1 = "Este es un ejercicio sobre la clase String";
        System.out.println(cadena1.length());
        System.out.println(cadena1.substring(11, 21));
        System.out.println(cadena1.replace("clase", "modificada"));
        System.out.println(cadena1.toLowerCase());
        System.out.println(cadena1.concat(" Palabra añadida"));
        System.out.println(cadena1.charAt(5));
        String palabra = " prueba ";
        String palabra2 = "Prueba";
        System.out.println(palabra.trim());
        System.out.println(palabra.equals(palabra2));
        System.out.println(palabra.equalsIgnoreCase(palabra2));
        System.out.println(palabra.toUpperCase());

    }
}