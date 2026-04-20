package model;

public class Orco extends Criatura{

    private double destrezaArmas;

    public Orco(String nombre) {
        super(nombre);
        setFuerza((double) ((int) (Math.random() * 4) + 7));
        setInteligencia((double)((int) (Math.random() * 3) + 1));
       setVelocidad((double)((int) (Math.random() * 3) + 1));
        destrezaArmas=(int) (Math.random() * 10) + 1;
    }

    @Override
    public String comer(){
        setFuerza(getFuerza()*1.15);
        destrezaArmas+=1;
        return "Estas comiendo ganas 1 de destreza y 15% de fuerza!!";
    }
@Override
public double media() {
        double media;
        media=getFuerza()+destrezaArmas+getInteligencia()+getVelocidad();
        return media/4;}
    @Override
    public String descansar() {
        destrezaArmas=destrezaArmas*1.05;
        setInteligencia(getInteligencia()-1);
        return "Estas descansando ganas 5% de destreza y pierdes 1 punto de inteligencia";
    }


    @Override
    public String toString() {
        return "Orcos{" +
                "fuerza=" + fuerza +
                ", inteligencia=" + inteligencia +
                ", velocidad=" + velocidad +
                ", destrezaArmas=" + destrezaArmas +
                '}';
    }
}
