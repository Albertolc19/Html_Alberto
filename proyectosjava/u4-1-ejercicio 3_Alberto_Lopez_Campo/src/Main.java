import model.Animal;
import model.Gato;
import model.Perro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro p1=new Perro("d",2,3);
        Perro p2=new Perro("b",3,2);
        Gato g1=new Gato("m",5,2);
        Gato g2=new Gato("c",1,6);
        System.out.println(p1.equals(g1));
        //Ocurre que sale falso porque un perro no es igual que un gato.
        System.out.println(p1 instanceof Perro);
        //Da que es verdad ya que un perro esta en el espacio de memoria de perro.
        //System.out.println(p1 instanceof Gato);
        //Da error porque mira que no esta en el mismo espacio de memoria y java no te deja siquiera usarlo.
        System.out.println(p1 instanceof Animal);
        //Si es una instancia de animal ya que es su padre y esta en el mismo espacio de memoria.
        System.out.println(p1.equals(p2));
        //Da error ya que los perros son diferentes aunque esten en el mismo espacio de memoria.
        System.out.println(p1.correr());
        System.out.println(g1.comer());
    }
}