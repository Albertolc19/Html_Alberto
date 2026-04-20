package modle;

public class Animal extends SerVivo implements Union{
    private int resistencia;
    private int velocidad;

    public Animal() {
        super();
        resistencia = (int)(Math.random() * 100)+1;
        velocidad = (int)(Math.random() * 100)+1;
    }
    public String respirar(){
        return "El animal está respirando";
    }

    @Override
    public String correr() {
        this.velocidad=velocidad+5;
        this.resistencia=resistencia-2;
        return "Esta corriendo";
    }

    @Override
    public String toString() {
        return super.toString()+"Animal{" +
                "resistencia=" + resistencia +
                ", velocidad=" + velocidad +
                '}';
    }
}
