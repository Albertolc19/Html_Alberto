public class CD extends Articulos{
    private int pistas;
    private Autor autor;

    public CD(String titulo, int edad, int pistas, Autor autor) {
        super(titulo, edad);
        this.pistas = pistas;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "CD{" +
                "pistas=" + pistas +
                ", autor=" + autor +
                '}';
    }
}
