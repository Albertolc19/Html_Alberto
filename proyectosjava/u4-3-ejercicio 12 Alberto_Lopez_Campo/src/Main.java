import model.Libro;
import model.Publicacion;
import model.Revista;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Publicacion publicacion= new Publicacion(2023,"juan");
Publicacion revista =  new Revista(2014,"pepe");
Publicacion libro =new Libro(2000,"maunel",12,37);
System.out.println(publicacion);
        System.out.println(revista);
        System.out.println(libro);
        publicacion= libro; //Funciona bien
        //libro =publicacion; no se puede
        //revista =publicacion; no se puede
        //revista =(Revista) publicacion; Peligroso en tiempo de ejecucion
        
    }
}