import modle.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mai
    public static void main(String[] args) {
        SerVivo planta=new Planta();
        SerVivo animal=new Animal();
        SerVivo humano=new Humano();
        System.out.println("=== CARACTERISTICAS ===");
        System.out.println(planta);
        System.out.println(animal);
        System.out.println(humano);
        System.out.println("\n=== INTERFAZ ===");
        //Union planta1=new Planta();
        Union animal1=new Animal();
        Union humano1=new Humano();
        System.out.println(animal1);
        System.out.println(humano1);
        //No es posible crear planta ya que no esta relacionada con la interfaz.
        System.out.println("\n=== RESPIRACION DIFERENTE ===");
        System.out.println(planta.respirar());
        System.out.println(animal.respirar());
        System.out.println(humano.respirar());
        System.out.println("\n=== CORRER ===");
        System.out.println("Antes de correr:");
        System.out.println(animal1);
        System.out.println(humano1);
        System.out.println(animal1.correr());
        System.out.println(humano1.correr());
        System.out.println("\nDespues de correr:");
        System.out.println(animal1);
        System.out.println(humano1);
    }
}