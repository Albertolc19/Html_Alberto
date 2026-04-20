public class Compañia {
    private String nombre;
    private String ciudad;

    public Compañia(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Compañia{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
