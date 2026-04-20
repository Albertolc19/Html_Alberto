package model;
public class Elfos extends Criatura{
    private double belleza;
    private double potencia;

    public Elfos(String nombre) {
        super(nombre);
        belleza=(int) (Math.random() * 10) + 1;
        potencia=(int) (Math.random() * 10) + 1;
        setFuerza((double) ((int) (Math.random() * 5) + 3));
        setInteligencia((double) ((int) (Math.random() * 4) + 7));
        setVelocidad((double) ((int) (Math.random() * 4) + 7));
    }

    @Override
    public String utilizarArcos(){
        this.potencia+=1;
        this.velocidad=this.velocidad*1.05;
        return "Estas utilizando un arco tu potencia y velocidad aumentan";
    }
    @Override
    public String toString() {
        return "Elfos{" +
                "belleza=" + belleza +
                ", inteligencia=" + inteligencia +
                ", velocidad=" + velocidad +
                ", fuerza=" + fuerza +
                ", potencia=" + potencia +
                '}';
    }
    @Override
    public double media() {
        double media;
        media=this.fuerza+this.potencia+this.inteligencia+this.velocidad+this.belleza;
        return media/6;}
}
