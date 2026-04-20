import model.Guitarra;
import model.Instrumento;
import model.Violin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Instrumento guitarra = new Guitarra("guay");
        Instrumento violin = new Violin("malo");
        System.out.println(guitarra.tocar());
        System.out.println(violin.tocar());
        System.out.println(guitarra);
        System.out.println(violin);
    }
}