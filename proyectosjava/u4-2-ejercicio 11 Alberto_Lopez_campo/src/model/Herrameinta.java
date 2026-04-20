package model;

public class Herrameinta extends Producto{
    public Herrameinta(String nombre) {
        super(nombre);
    }
    public String registrar() {
        return "La herramienta cuyo nombre es "+getNombre()+" se ha registrado correctamente.";
    }
}
