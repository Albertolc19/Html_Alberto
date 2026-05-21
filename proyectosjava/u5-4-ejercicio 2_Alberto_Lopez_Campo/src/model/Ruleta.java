package model;

import java.util.Objects;

public class Ruleta extends Juego{
    private int tamanio;

    public Ruleta(int codigo, String premio, int tamanio) {
        super(codigo, premio);
        this.tamanio = tamanio;
    }
    @Override
    public boolean equals(Object o){
        if(this==o){return true;}
        if(!(o instanceof Ruleta)){return false;}
        Ruleta a=(Ruleta) o;
        return getCodigo()== a.getCodigo();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return super.toString()+"Ruleta{" +
                "tamanio=" + tamanio +
                '}';
    }
}
