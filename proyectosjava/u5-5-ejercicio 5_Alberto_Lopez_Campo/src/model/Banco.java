package model;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    Map<String, Cuenta> cuentasBancarias;
    public Banco() {
        cuentasBancarias = new HashMap<String, Cuenta>();
    }
    public void addCuenta(String nombre, int numCuenta, int balance){
        cuentasBancarias.put(nombre,new Cuenta(numCuenta,balance));
    }
    public Cuenta getCuenta(String nombre){
        return cuentasBancarias.get(nombre);
    }
    public String listarClientes(){
        String resultado="";
        for(String g1:cuentasBancarias.keySet()){
            resultado += "\nClave: "+g1;
        }
        return resultado;
    }
}
