public class Perro extends Animal{
    private String nombrePropietario;

    public Perro(String nombre, String raza, String nombrePropietario) {
        super(nombre, raza);
        this.nombrePropietario = nombrePropietario;
    }
}
