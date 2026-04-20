package model;

public class Secretario extends Empleado{
    private String ciudad="";
    private int año=0;

    public String getCiudad() {
        return ciudad;
    }

    public int getAño() {
        return año;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Secretario(String dni, String nombre, String apelidos, int experiencia, double salario, String ciudad, int año) {
        super(dni, nombre, apelidos, experiencia, salario);
        this.ciudad = ciudad;
        this.año = año;
    }

}
