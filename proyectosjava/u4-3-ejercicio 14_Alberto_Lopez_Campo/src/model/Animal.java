package model;

import java.time.LocalDate;

public abstract class Animal {
    private String nombre;
    private int anioNacimiento;
    private int nPatas;
    private Persona duenio;

    public Animal(String nombre, int anioNacimiento, int nPatas, Persona duenio) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.nPatas = nPatas;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                ", nPatas=" + nPatas +
                ", duenio=" + duenio +
                '}';
    }

    public abstract String emitirSonido();
    public abstract String comer();
    public  int saberEdad(){
        return LocalDate.now().getYear()-getAnioNacimiento();
    }
}
