package model;

public class Soldado extends Militar{
    private double hablidad=0;

    public Soldado(String dni, String nombre, int edad, double hablidad) {
        super(dni, nombre, edad);
        this.hablidad = hablidad;
    }

    public double getHablidad() {
        return hablidad;
    }

    public void setHablidad(double hablidad) {
        this.hablidad = hablidad;
    }
}
