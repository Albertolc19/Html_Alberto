package model;

public class Violin extends Instrumento{
    public Violin(String tipo) {
        super(tipo);
    }

    @Override
    public String tocar() {
        return "Se toca con el arco";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
