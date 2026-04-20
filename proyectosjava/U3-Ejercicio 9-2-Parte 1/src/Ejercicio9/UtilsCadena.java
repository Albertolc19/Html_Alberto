package Ejercicio9;

public class UtilsCadena {
    public static int calcularLongitud(String texto) {
        int longitud = texto.length();
        return longitud;
    }

    public static String convertirMayusculas(String texto) {
        String mayusculas = texto.toUpperCase();
        return mayusculas;
    }

    public static String convertirMinusculas(String texto) {
        String minusculas = texto.toLowerCase();
        return minusculas;
    }

    public static String sacarSubcadena(String texto) {
        if(UtilsCadena.calcularLongitud(texto)>=3) {
            String subcadena = texto.substring(1, 3);
            return subcadena;
        }else return "Cadena demasiado pequeña";
    }

    public static int contarCaracteres(String texto, char caracter) {
        String sinEspacios = texto.trim();
        int longitud = texto.length();
        int numRepeticion = 0;
        for (int contador = 0; contador < longitud; contador++) {
            char sigla= sinEspacios.charAt(contador);
            if (sigla == caracter) {
                numRepeticion++;
            }
        }
        return numRepeticion;
    }
}
