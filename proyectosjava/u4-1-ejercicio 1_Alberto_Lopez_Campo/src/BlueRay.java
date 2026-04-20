public class BlueRay extends Articulos{
    private int velocidad;
    private int capacidad;

    public BlueRay(String titulo, int edad, int velocidad, int capacidad) {
        super(titulo, edad);
        this.velocidad = velocidad;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "BlueRay{" +
                "velocidad=" + velocidad +
                ", capacidad=" + capacidad +
                '}';
    }
}
