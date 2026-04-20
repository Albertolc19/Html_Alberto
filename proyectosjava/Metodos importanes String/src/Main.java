//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Cadena base para los ejemplos
        String original = " Hola Mundo ";
        String otraCadena = "hola mundo";
        String parte = "Mundo";

        System.out.println("--- Cadena Original: \"" + original + "\" ---");

        // 1. charAt(int index)
        // Explicación: Devuelve el carácter en el índice especificado (0-basado).
        char caracter = original.charAt(3);
        System.out.println("\n1. charAt(3): " + caracter); // Output: a

        // 2. concat(String str)
        // Explicación: Añade la String especificada al final de la String actual.
        // Nota: El operador '+' también funciona y es más común.
        String concatenada = original.concat(parte);
        System.out.println("2. concat(\"Mundo\"): " + concatenada); // Output:   Hola Mundo  Mundo

        // 3. equals(Object anObject)
        // Explicación: Compara la String con otra String para ver si son exactamente iguales (sensible a mayúsculas).
        boolean sonIguales = original.equals(otraCadena);
        System.out.println("3. equals(\"hola mundo\"): " + sonIguales); // Output: false (Por espacios y mayúsculas)

        // 4. equalsIgnoreCase(String anotherString)
        // Explicación: Compara la String con otra String, ignorando las diferencias de mayúsculas y minúsculas.
        boolean sonIgualesIgnorandoCaso = original.equalsIgnoreCase(otraCadena);
        System.out.println("4. equalsIgnoreCase(\"hola mundo\"): " + sonIgualesIgnorandoCaso); // Output: false (Por espacios)

        // 5. length()
        // Explicación: Devuelve el número de caracteres de la String.
        int longitud = original.length();
        System.out.println("5. length(): " + longitud); // Output: 14 (Incluye los espacios)

        // 6. replace(char oldChar, char newChar)
        // Explicación: Reemplaza todas las apariciones de un carácter por otro.
        String reemplazada = original.replace('o', 'X');
        System.out.println("6. replace('o', 'X'): " + reemplazada); // Output:   HOla MundX

        // 7. substring(int beginIndex) / substring(int beginIndex, int endIndex)
        // Explicación: Devuelve una nueva String que es una subcadena de esta String.
        // El índice final es exclusivo.
        String subcadena = original.substring(6, 11);
        System.out.println("7. substring(6, 11): " + subcadena); // Output: Mundo (Excluye el espacio del final)

        // 8. toLowerCase()
        // Explicación: Convierte todos los caracteres de la String a minúsculas.
        String minusculas = original.toLowerCase();
        System.out.println("8. toLowerCase(): " + minusculas); // Output:   hola mundo

        // 9. toUpperCase()
        // Explicación: Convierte todos los caracteres de la String a mayúsculas.
        String mayusculas = original.toUpperCase();
        System.out.println("9. toUpperCase(): " + mayusculas); // Output:   HOLA MUNDO

        // 10. toString()
        // Explicación: Retorna el valor de la String (esencialmente, la misma String).
        // Aunque es redundante para String, es útil para otras clases para obtener su representación en String.
        String valorString = original.toString();
        System.out.println("10. toString(): " + valorString); // Output:   Hola Mundo

        // 11. trim()
        // Explicación: Elimina los espacios en blanco iniciales y finales de la String.
        String sinEspacios = original.trim();
        System.out.println("11. trim(): \"" + sinEspacios + "\""); // Output: "Hola Mundo"
    }
}