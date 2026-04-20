package model;

import java.util.Date;

public class CuentaCliente {
    private String nombre;
    private Date fechaCreacion;

    public CuentaCliente(String nombre) {
        this.nombre = nombre;
        fechaCreacion = new Date();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "CuentaCliente{" +
                "nombre='" + nombre + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }

    public String registrarCuenta(String dni){
        for(int i = 0; i < 10; i++) {
            dni += ((int) (Math.random() * 9) + 1);
        }
        return dni;
    }
    public String registrarCuenta(String nombre, String apellido){
        String texto=nombre + apellido;
        texto = texto.toLowerCase();
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            switch (c) {
                case 'A','a': resultado += "1"; break;
                case 'e': resultado += "2"; break;
                case 'i': resultado += "3"; break;
                case 'o': resultado += "4"; break;
                case 'u': resultado += "5"; break;
                default: resultado += c;
            }
        }
        return resultado;
    }
    public String registrarCuenta(int dia, int mes, int anio){
        int sumaAnio = 0;

            sumaAnio= anio%10 + (anio/10)%10 + (anio/100)%10 + (anio/1000)%10;
            sumaAnio*=mes;
            sumaAnio+=dia;
        String texto = Integer.toString(sumaAnio);
            if(sumaAnio%5==0){
                texto+="A";
            }else if(sumaAnio%4==0){
                texto+="B";
            }else texto+="C";
return texto;
    }
}

