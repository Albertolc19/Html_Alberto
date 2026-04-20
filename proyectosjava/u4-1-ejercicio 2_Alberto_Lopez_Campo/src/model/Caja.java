package model;

public class Caja {
    private Double ancho;
    private Double alto;
    private Double largo;

    public Caja(Double ancho, Double alto, Double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double calularVolumen(){
        Double resultado=0.0;
        resultado= ancho*alto*largo;
        return resultado;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }
}
