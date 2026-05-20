package model;

import java.util.HashMap;
import java.util.Map;

public class ListinTelefonico {
    public ListinTelefonico() {
    }
    private Map<String,String> listaTelefonos =new HashMap<>();
    public void introducirNumero(String nombre, String numero){
        listaTelefonos.put(nombre,numero);
    }
    public String buscarNumero(String nombre){
        return listaTelefonos.get(nombre);
    }
    public String devolverNombres(String numero){
        String resultado="";
        for(Map.Entry<String, String> entrada : listaTelefonos.entrySet()){
            if(entrada.getValue()== numero){
                resultado=entrada.getKey();
            }
        }
        return resultado;
    }
}
