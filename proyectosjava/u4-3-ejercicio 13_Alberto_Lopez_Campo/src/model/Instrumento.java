package model;

public abstract class Instrumento {
    private String tipo;

    public Instrumento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
    public abstract String tocar();
}
