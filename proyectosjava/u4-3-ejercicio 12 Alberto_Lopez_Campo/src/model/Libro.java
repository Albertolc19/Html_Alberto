package model;

public class Libro extends Publicacion{
    private int ISBN;
    private int numPaginas;

    public Libro(int anio, String nombre, int numPaginas, int ISBN) {
        super(anio, nombre);
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
    }
    public String publicar(){
        return"El libro se ha publicado en la fecha "+getAnio();
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
