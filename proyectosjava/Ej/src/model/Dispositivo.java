package model;

public class Dispositivo {
    private String modelo;
    private int nivelUso;

    public Dispositivo(String modelo) {
        this.modelo = modelo;
        this.nivelUso = (int)(Math.random() * 10)+1;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNivelUso() {
        return nivelUso;
    }

    public void setNivelUso(int nivelUso) {
        this.nivelUso = nivelUso;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "modelo='" + modelo + '\'' +
                ", nivelUso=" + nivelUso +
                '}';
    }
    public double prestaciones(){return 0;}
}
