import model.Banco;
import model.Cliente;
import model.Cuenta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco=new Banco();
        Cliente c1 = new Cliente("111A", "Ana");
        Cliente c2 = new Cliente("222B", "Juan");
        Cliente c3 = new Cliente("333C", "Luis");
        Cliente c4 = new Cliente("444D", "Marta");
        Cliente c5 = new Cliente("555E", "Pedro");
        banco.anadirCliente(c1);
        banco.anadirCliente(c2);
        banco.anadirCliente(c3);
        banco.anadirCliente(c4);
        banco.anadirCliente(c5);
        System.out.println(banco.getClientes());
        Cuenta cuenta1 = new Cuenta(001, 1000);
        Cuenta cuenta2 = new Cuenta(002, 2000);
        Cuenta cuenta3 = new Cuenta(003, 1500);
        Cuenta cuenta4 = new Cuenta(004, 3000);
        Cuenta cuenta5 = new Cuenta(005, 500);
        banco.anadirCuenta(cuenta1);
        banco.anadirCuenta(cuenta2);
        banco.anadirCuenta(cuenta3);
        banco.anadirCuenta(cuenta4);
        banco.anadirCuenta(cuenta5);
        System.out.println(banco.getCuentas());
        System.out.println(banco.);
    }
}