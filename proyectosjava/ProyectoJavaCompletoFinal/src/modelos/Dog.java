package modelos;

public class Dog extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau");
    }

    public void playDead() {
        System.out.println("El perro se hace el muerto");
    }
}