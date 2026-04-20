public class DVD extends Articulos{
    private String tipo;
    private Compañia compañia;

    public DVD(String titulo, int edad, String tipo, Compañia compañia) {
        super(titulo, edad);
        this.tipo = tipo;
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "tipo='" + tipo + '\'' +
                ", compañia=" + compañia +
                '}';
    }
}
