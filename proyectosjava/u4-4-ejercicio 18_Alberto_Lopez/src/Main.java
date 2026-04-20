import model.Apellidable;
import model.Nombrable;
import model.Persona;
import model.Runnable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nombrable nombre=new Persona("david","martinez",23);
        Apellidable apellidable=new Persona("david","martinez",23);
        Runnable velocidad=new Persona("david","martinez",23);
        Persona persona=new Persona("david","martinez",23);
        //Probar nombre No te deja probar los que no estan en la clase
        nombre.setNombre("juan");
        //nombre.setApellidos("pepe");
        //nombre.setVelocidad(22);
        System.out.println(nombre.getNombre());
        //System.out.println(nombre.getApellido());
        //System.out.println(nombre.getVelocidad());
        //Probar apellidable No te deja probar los que no estan en la clase
        //apellidable.setNombre("juan");
        apellidable.setApellidos("pepe");
        //apellidable.setVelocidad(22);
        //System.out.println(apellidable.getNombre());
        System.out.println(apellidable.getApellidos());
        //System.out.println(apellidable.getVelocidad());
        //Probar velocidad Te deja probarlos todos ya que estan todos dentro de la clase.
        velocidad.setNombre("juan");
        velocidad.setApellidos("pepe");
        velocidad.setVelocidad(22);
        System.out.println(velocidad.getNombre());
        System.out.println(velocidad.getApellidos());
        System.out.println(velocidad.getVelocidad());
        //Probar persona Te deja probarlos todos ya que estan todos dentro de la clase.
        persona.setNombre("juan");
        persona.setApellidos("pepe");
        persona.setVelocidad(22);
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellidos());
        System.out.println(persona.getVelocidad());
    }
}