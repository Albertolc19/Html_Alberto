package poo;

import modelos.Animal;
import modelos.Dog;

public class ApuntesCasting {

    public static void ejecutar() {

        Animal animal = new Dog();

        // Downcasting
        Dog dog = (Dog) animal;

        dog.playDead();
    }
}