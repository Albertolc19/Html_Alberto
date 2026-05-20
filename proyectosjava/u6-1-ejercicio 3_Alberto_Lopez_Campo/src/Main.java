import model.calculadora;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        calculadora miCalc = new calculadora(6, 4);

        try {
            float resultado = miCalc.dividir();
            System.out.println("El resultado de dividir " + miCalc.getOperando1() +
                    " entre " + miCalc.getOperando2() + " es " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("El operando 2 no puede ser 0");
        } finally {
            miCalc.resetear();
            System.out.println("--- Calculadora reseteada ---");
        }

        try {
            float resultado = miCalc.dividir();
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("El operando 2 no puede ser 0");
        }
    }
}