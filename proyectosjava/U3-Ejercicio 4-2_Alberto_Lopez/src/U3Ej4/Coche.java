package U3Ej4;

public class Coche {
    private double precioSinIva;
    private String marcaCoche;

    public Coche(double p, String m) {
        this.precioSinIva = p;
        this.marcaCoche = m;

    }

    public double getPrecioSinIva() {
        return this.precioSinIva;
    }

    public String getMarcaCoche() {
        return this.marcaCoche;
    }
    public setMarca(String a) {
        this.marcaCoche=a;
    }

    public double CalcularPrecioIva(Coche a) {
        return this.precioSinIva * 1.21;
    }

    public String empezar_conducir() {
        return "Los pasos para enpezar a conducir son: \n1.Arrancar coche.\n" + "\n" + "2.Meter marcha.\n" + "\n" + "3.Acelerar coche.";
    }

    public int compararPrecioCoche(Coche c) {
        int coche;
        if (this.precioSinIva == c.getPrecioSinIva()) {
            coche = 0;
        } else if (this.precioSinIva > c.getPrecioSinIva()) {
            coche = 1;
        } else {
            coche = -1;
        }
        return coche;
    }
}