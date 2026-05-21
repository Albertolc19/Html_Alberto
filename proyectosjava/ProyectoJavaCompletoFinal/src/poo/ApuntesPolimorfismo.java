package poo;

import modelos.Animal;
import modelos.Dog;

public class ApuntesPolimorfismo {

    public static void ejecutar() {

        // Polimorfismo
        Animal animal = new Dog();

        animal.hacerSonido();
    }
}