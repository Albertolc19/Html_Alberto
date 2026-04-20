import model.*;
import static model.Entrenamiento.realizarEntrenamiento;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*1.Crea un Militar cuyo tipo de Referencia sea Militar y el tipo de la instancia del Objeto sea Militar Llama al realizar entrenamiento pasándole el Objeto creado anteriormente.
       ¿A qué metodo invoca y por qué?
       Invoca al metodo militar porque comprueba que objeto le llama.*/
        Militar militar=new Militar( "24242424F","Juan",23);
        System.out.println(realizarEntrenamiento(militar));
        /*2.Crea un Militar cuyo tipo de Referencia sea Militar y el tipo de la instancia del Objeto sea Sargento. Llama al realizar entrenamiento pasándole el Objeto creado anteriormente.
        ¿A qué metodo invoca y por qué?
        Invoca al metodo militar porque comprueba el objeto de referencia es militar. */
        Militar militar1=new Sargento("34353637J","pablo",23,37);
        System.out.println(realizarEntrenamiento(militar1));
        /*3.Crea un Militar cuyo tipo de Referencia sea Sargento y el tipo de la instancia del Objeto sea Sargento. Llama al realizar entrenamiento pasándole el Objeto creado anteriormente.
        ¿A qué metodo invoca y por qué?
        Ahora llama a sargento porque es su referencia*/
        Sargento sargento=new Sargento("343532347J","juan",12,37);
        System.out.println(realizarEntrenamiento(sargento));
        /*4.Crea un Militar cuyo tipo de Referencia sea General y el tipo de la instancia del Objeto sea General. Llama al realizar entrenamiento pasándole el Objeto creado anteriormente.
        ¿A qué metodo invoca y por qué?
        Ahora llama a general porque es su referencia*/
        General general=new General("343532347J","juan",12,37,23);
        System.out.println(realizarEntrenamiento(general));
        /*5.Crea un Militar cuyo tipo de Referencia sea Militar y el tipo de la instancia del Objeto sea Soldado. Llama al realizar entrenamiento pasándole el Objeto creado anteriormente.
        ¿A qué metodo invoca y por qué?
        Sigue sin cambiar el objeto de referencia es igual que el anterior*/
        Militar militar2=new Soldado("343532347J","juan",12,37);
        System.out.println(realizarEntrenamiento(militar2));
        /*6.Crea un Militar cuyo tipo de Referencia sea Soldado y el tipo de la instancia del Objeto sea Soldado. Llama al realizar entrenamiento pasándole el Objeto creado anteriormente.
        ¿A qué metodo invoca y por qué?
        Ahora llama a soldado porque es su referencia*/
        Soldado soldado=new Soldado("343532347J","juan",12,37);
        System.out.println(realizarEntrenamiento(soldado));
        /*7.Haz que 3 militares de los creados anteriormente puedan participar en una guerra y muestra los resultados.*/
        System.out.println(militar.participarGuerra());
        System.out.println(sargento.participarGuerra());
        System.out.println(general.participarGuerra());
        /*8.Crea un Militar cuyo tipo de Referencia sea Soldado y el tipo de la instancia del Objeto sea Militar
        ¿Qué esta ocurriendo?
        No me deja ya que llamar a la clase padre desde el hijo no tiene sentido*/
        //Soldado soldado1 = new Militar("45464747M","David",23);
    }
}