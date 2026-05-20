package model;

import java.util.Objects;

public class BlackJack extends Juego{
    private int numCartas;

    public BlackJack(int codigo, String premio, int numCartas) {
        super(codigo, premio);
        this.numCartas = numCartas;
    }
    @Override
    public boolean equals(Object o){
        if(this==o){return true;}
        if(!(o instanceof BlackJack)){return false;}
        BlackJack a=(BlackJack) o;
        return getCodigo()== a.getCodigo();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return super.toString()+"BlackJack{" +
                "numCartas=" + numCartas +
                '}';
    }
}
