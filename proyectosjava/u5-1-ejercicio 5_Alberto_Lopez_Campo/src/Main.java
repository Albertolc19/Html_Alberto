import model.Trabajador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Trabajador t1 = new Trabajador("111A", "Juan", 1200, "01/01/2020");
        Trabajador t2 = new Trabajador("222B", "Ana", 1300, "05/03/2021");
        Trabajador t3 = new Trabajador("333C", "Luis", 1100, "10/06/2019");
        Trabajador t4 = new Trabajador("444D", "Marta", 1400, "20/09/2022");
        Trabajador t5 = new Trabajador("555E", "Carlos", 1250, "15/12/2020");

        tienda.agregarTrabajador(t1);
        tienda.agregarTrabajador(t2);
        tienda.agregarTrabajador(t3);
        tienda.agregarTrabajador(t4);
        tienda.agregarTrabajador(t5);
        System.out.println(tienda.mostrarTrabajadores());

        System.out.println(tienda.cambiarSalario("111A",1534));
        System.out.println(tienda.cambiarSalario("222B",1534));

        System.out.println(tienda.mostrarTrabajadores());

    }
}