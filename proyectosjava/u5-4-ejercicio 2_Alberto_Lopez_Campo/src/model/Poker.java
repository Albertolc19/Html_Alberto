package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Poker extends Juego{
    private String tipo;

    public Poker(int codigo, String premio, String tipo) {
        super(codigo, premio);
        this.tipo = tipo;
    }
    @Override
    public boolean equals(Object o){
        if(this==o){return true;}
        if(!(o instanceof Poker)){return false;}
        Poker a=(Poker) o;
        return getCodigo()== a.getCodigo()&&Objects.equals(this.tipo, a.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(),tipo);
    }

    @Override
    public String toString() {
        return super.toString()+"Poker{" + super.toString() + ", tipo=" + tipo + "}";
    }
}
