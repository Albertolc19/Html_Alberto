import model.Banco;
import model.Cuenta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco b=new Banco();
        b.addCuenta("Manuel",23,4);
        b.addCuenta("juan",13,5);
        System.out.println(b.getCuenta("Manuel"));
        System.out.println(b.getCuenta("juan"));
        System.out.println(b.listarClientes());
    }
}