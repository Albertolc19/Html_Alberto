package model;

public class Cubo extends Caja{
    private int peso;

    public Cubo(Double ancho, Double alto, Double largo, int peso) {
        super(ancho, alto, largo);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super .toString()+"Cubo{" +
                "peso=" + peso +
                '}';
    }
}
