package model;

public class Fruta extends Producto{
    int identificador;
    public Fruta(String nombre) {
        super(nombre);
    }
    public String registrar() {
        return "La fruta cuyo nombre es "+getNombre()+" se ha registrado correctamente.";
    }
    public String registrar(int identificador) {
        this.identificador=identificador;
        return "La fruta cuto identificador es "+identificador+" se ha registrado correctamente.";
    }
}
