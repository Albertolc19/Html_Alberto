import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Prueba funcionalidad 1
        //Crear dispositivos:
        Dispositivo portatil=new Portatil("HP",71,4,"Core i5");
        Dispositivo impresora=new Impresora("HP LaserJet","laser",310);
        Dispositivo proyector=new Proyector("Epson",false,97.0);
        //Mostrar modelo:
        System.out.println(portatil.getModelo());
        System.out.println(impresora.getModelo());
        System.out.println(proyector.getModelo());
        System.out.println("El nivel de la impresora antes: "+impresora.getNivelUso());
        //Mostrar prestaciones:
        System.out.println(portatil.prestaciones());
        System.out.println(impresora.prestaciones());
        System.out.println(proyector.prestaciones());
        //Mostrar nivel impresora despues:
        System.out.println("El nivel de la impresora despues: "+impresora.getNivelUso());
         */

        /*Prueba funcionalidad 2
        //Crear dispositivos:
        Portatil portaitl=new Portatil("Dell Inspiron",120,8,"Ryzen 5");
        Impresora impresora=new Impresora("Canon Pixar","inkjet",150);
        Proyector proyector=new Proyector("BenQ",true,120.0);
        //Crear clase:
        Aula aula1=new Aula("1DAW");
        //Hacer revisiones
        System.out.println(aula1.revision(portaitl,5));
        System.out.println(aula1.revision(impresora,3));
        System.out.println(aula1.revision(proyector,4));
        //Mostrar niveles de uso de cada uno
        System.out.println("El nivel de uso del portatil es: "+ portaitl.getNivelUso());
        System.out.println("El nivel de uso de la impresora es: "+ impresora.getNivelUso());
        System.out.println("El nivel de uso del proyector es: "+ proyector.getNivelUso());
        */

        /*Prueba funcionalidad 3
        //Crear dispositivos:
        Portatil portaitl=new Portatil("Dell Inspiron",120,8,"Ryzen 5");
        Impresora impresora=new Impresora("Canon Pixar","inkjet",150);
        Proyector proyector=new Proyector("BenQ",true,120.0);
        //Crear clase:
        Aula aula1=new Aula("1DAW");
        //Crear diagnosticos
        System.out.println(aula1.diagnostico(portaitl));
        System.out.println(aula1.diagnostico(proyector));
        //System.out.println(aula1.diagnostico(impresora));
         */
        //Prueba funcionalidad 4
        //Crear portatil:
        Portatil portaitl = new Portatil("Dell Inspiron", 120, 8, "Ryzen 5");
        //Hacer simulacion
        System.out.println(portaitl.simulacionValoraciones(3,4));
        //Estan todos las pruebas separas para facilitar la correcion. Muchas gracias :)
    }
}