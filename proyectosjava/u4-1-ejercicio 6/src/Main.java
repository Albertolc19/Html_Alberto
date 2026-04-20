import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestion = new GestionEmpleados();
        Empleado prof = new Profesor("111A", "Juan", "Lopez", 5, 2000, 3, "Matemáticas");
        Empleado secr = new Secretario("222B", "Ana", "Perez", 8, 1800, "Madrid", 2015);
        Empleado limp = new Limpiador("333C", "Carlos", "Gomez", 2, 1200, 40);
        System.out.println("Los departamentos son");
        System.out.println(gestion.mostrarDepartamento(prof));
        System.out.println(gestion.mostrarDepartamento(secr));
        System.out.println(gestion.mostrarDepartamento(limp));
        System.out.println(gestion.aumentarSalario(prof));
        System.out.println(gestion.aumentarSalario(secr));
        System.out.println(gestion.aumentarSalario(limp));
        System.out.println(gestion.modificarExperiencia(prof, 3));
        System.out.println(gestion.modificarExperiencia(secr, 5));
        System.out.println(gestion.modificarExperiencia(limp, 9));
        gestion.modificarEmpleado(prof);
        System.out.println(prof);
        gestion.modificarEmpleado(secr);
        System.out.println(secr);
        gestion.modificarEmpleado(limp);
        System.out.println(limp);
    }
}