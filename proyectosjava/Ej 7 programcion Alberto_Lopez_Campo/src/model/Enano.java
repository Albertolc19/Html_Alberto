package model;

public class Enano extends Criatura {
    private double capacidadDanio;

    public Enano(String nombre) {
        super(nombre);
        setFuerza((double) ((int) (Math.random() * 3) + 1));
        setInteligencia((double) ((int) (Math.random() * 4) + 7));
        setVelocidad((double) ((int) (Math.random() * 5) + 3));
        capacidadDanio = (int) (Math.random() * 10) + 1;
    }

    @Override
    public String crearArmas() {
        setFuerza(getFuerza()* 1.20);
        capacidadDanio += 1;
        return "Creando arma fuerza y daño aumentados!!!";
    }

    @Override
    public String comer() {
        setInteligencia(getInteligencia()+1);
        setVelocidad(getVelocidad()* 1.05);
        return "Estas comiendo tu inteligencia y velocidad aumentan";
    }

    @Override
    public String descansar() {
        this.capacidadDanio = this.capacidadDanio * 1.05;
        setVelocidad(getVelocidad()+ 1);
        return "Estas descansando tu velocidad y capacidad de daño aumentan";
    }

    @Override
    public String toString() {
        return "Enano{" +
                "inteligencia=" + inteligencia +
                ", velocidad=" + velocidad +
                ", fuerza=" + fuerza +
                ", capacidadDaño=" + capacidadDaño +
                '}';
    }
    @Override
    public double media() {
        double media;
        media=this.fuerza+this.capacidadDaño+this.inteligencia+this.velocidad;
        return media/4;}
}
