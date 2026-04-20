package model;

public class Aula {
    private String nombre="";
    private int pupitres=0;

    public Aula(String nombre, int pupitres) {
        this.nombre = nombre;
        this.pupitres = pupitres;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "nombre='" + nombre + '\'' +
                ", pupitres=" + pupitres +
                '}';
    }
}
