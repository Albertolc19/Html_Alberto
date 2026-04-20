import Gato.Gato;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Felix","presa","25","5","blanco");
        Gato gato2 = null;
        gato2= gato1;
        gato1.setColor("marron");
        System.out.println(gato1.getColor());
        System.out.println(gato2.getColor());
    }
    String cadena1= new String("Mi primera cadena");
}