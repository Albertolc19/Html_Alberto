package model;

public class AulaTaller extends Aula{
    private int ordenadores=0;

    public AulaTaller(String nombre, int pupitres, int ordenadores) {
        super(nombre, pupitres);
        this.ordenadores = ordenadores;
    }

    @Override
    public String toString() {
        return toString()+"AulaTaller{" +
                "ordenadores=" + ordenadores +
                '}';
    }
}

