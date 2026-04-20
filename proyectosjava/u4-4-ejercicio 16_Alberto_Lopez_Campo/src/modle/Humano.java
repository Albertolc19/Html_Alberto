package modle;

public class Humano extends SerVivo implements Union{
    private int resistencia;
    private int velocidad;

    public Humano() {
        super();
        resistencia = (int)(Math.random() * 100)+1;
        velocidad = (int)(Math.random() * 100)+1;
    }
    public String respirar(){
        return "El humano está respirando";
    }

    @Override
    public String correr() {
        this.velocidad=velocidad+1;
        setPeso(getPeso()-1);
        this.resistencia=resistencia-1;
        return "Esta corriendo";
    }

    @Override
    public String toString() {
        return super.toString()+"Humano{" +
                "resistencia=" + resistencia +
                ", velocidad=" + velocidad +
                '}';
    }
}
