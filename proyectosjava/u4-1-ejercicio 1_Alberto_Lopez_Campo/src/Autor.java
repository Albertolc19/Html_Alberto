public class Autor {
    private String Nombre;
    private String Apellidos;
    private int edad;

    public Autor(String nombre, String apellidos, int edad) {
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
