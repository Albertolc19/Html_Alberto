package ej9_2;

public class ProcesadorPalabras {
    public static char primeraSigla(String palabra){
        String sinEspacios = palabra.trim();
        return sinEspacios.charAt(0);
    }
    public static char ultimaSigla(String palabra){
        String sinEspacios = palabra.trim();
        int longitud = sinEspacios.length();
        return sinEspacios.charAt(longitud-1);
    }
    public static String trianguloLetras(String palabra){
        String sinEspacios = palabra.trim();
        int longitud = sinEspacios.length();
        int contador=0;
        int contador2=2;
        String resultado="";
        while(contador<longitud){
            if(contador==0){
             resultado+=sinEspacios.substring(0, contador2);
             contador2++;
            contador++;

        }
    }
}
