import model.Agenda;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Agenda agenda= new Agenda();
        List<String> anotaciones=new ArrayList<String>();
        agenda.addNota("me gustan las patatas");
        agenda.addNota("comer es bueno");
        agenda.addNota("me gusta programar");
        agenda.addNota("me aburro");
        agenda.addNota("tengo que añadir 10 :V");
        agenda.addNota("anotacion 6");
        agenda.addNota("anotacion 7");
        agenda.addNota("anotacion 8");
        agenda.addNota("anotacion 9");
        agenda.addNota("me canse jajaja");
        System.out.println(agenda.getNotas());
        System.out.println(agenda.getNumNotas());
        System.out.println(agenda.mostrarNota(3));
        //System.out.println(agenda.mostrarNota(10)); No se puede solo hay hasta la 9 jajaja
        agenda.borrarNota(0);
        System.out.println(agenda.getNotas());
    }
}