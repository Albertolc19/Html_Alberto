import model.BlackJack;
import model.Casino;
import model.Poker;
import model.Ruleta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Casino casino1 = new Casino("Malor", "juan paulo");
        Poker p1 = new Poker(100, "4", "Ohama");
        Poker p2 = new Poker(200, "2", "Ohama");
        Poker p3 = new Poker(150, "3", "Texas Holdem");
        Poker p4 = new Poker(300, "1", "Texas Holdem");
        Ruleta r1 = new Ruleta(500, "10", 40);
        Ruleta r2 = new Ruleta(600, "20", 60);
        BlackJack b1 = new BlackJack(400, "5", 43);
        BlackJack b2 = new BlackJack(450, "6", 23);
        casino1.anadirJuegos(p1);
        casino1.anadirJuegos(p2);
        casino1.anadirJuegos(p3);
        casino1.anadirJuegos(p4);
        casino1.anadirJuegos(r1);
        casino1.anadirJuegos(r2);
        casino1.anadirJuegos(b1);
        casino1.anadirJuegos(b2);
        System.out.println(casino1);
        Ruleta r4 = new Ruleta(500, "24", 40);
        System.out.println("Es el siguiente: " + casino1.seleccionarJuegos(r4));
        Poker nuevoPoker = new Poker(100, "4", "Ohama");
        System.out.println("Es el siguiente: " + casino1.seleccionarJuegos(nuevoPoker));
        BlackJack b3 = new BlackJack(400, "4", 45);
        System.out.println("Es el siguiente: " + casino1.seleccionarJuegos(b3));
    }
}