package model;

public class Guitarra extends Instrumento{
    public Guitarra(String tipo) {
        super(tipo);
    }

    @Override
    public String tocar() {
        return "Se toca con los dedos";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
