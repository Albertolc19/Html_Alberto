package model;

public class General extends Militar{
    private double capacidadMando=0;
    private int nPersonasCargo=0;

    public General(String dni, String nombre, int edad, double capacidadMando, int nPersonasCargo) {
        super(dni, nombre, edad);
        this.capacidadMando = capacidadMando;
        this.nPersonasCargo = nPersonasCargo;
    }

    public double getCapacidadMando() {
        return capacidadMando;
    }

    public void setCapacidadMando(double capacidadMando) {
        this.capacidadMando = capacidadMando;
    }

    public int getnPersonasCargo() {
        return nPersonasCargo;
    }

    public void setnPersonasCargo(int nPersonasCargo) {
        this.nPersonasCargo = nPersonasCargo;
    }
}
