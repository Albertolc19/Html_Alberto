import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona duenio = new Persona(19, "Alberto");
        Animal perro = new Perro("Juan", 2006, 4, duenio, "Casa");
        Animal gato = new Gato("pepe", 2012, 4, duenio, "Martillo");
        Animal vaca = new Vaca("Fran", 2014, 4, duenio);
        System.out.println(perro.comer());
        System.out.println(gato.comer());
        System.out.println(vaca.comer());
        System.out.println(perro.emitirSonido());
        System.out.println(gato.emitirSonido());
        System.out.println(vaca.emitirSonido());
        System.out.println(perro.saberEdad());
        System.out.println(gato.saberEdad());
        System.out.println(vaca.saberEdad());
        System.out.println(perro);
        System.out.println(gato);
        System.out.println(vaca);
    }
}