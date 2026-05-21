import model.Propagacion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Propagacion propagacion = new Propagacion();
        try {
            // Ejemplo 1: Probando con una palabra válida
            String resultado1 = propagacion.revertir("hola");
            System.out.println("Resultado 1: " + resultado1);

            // Ejemplo 2: Provocamos la excepción con un String vacío
            System.out.println("\nIntentando revertir un String vacío...");
            String resultado2 = propagacion.revertir("");
            System.out.println("Resultado 2: " + resultado2);

        } catch (IllegalArgumentException e) {
            // Capturamos el error lanzado por la clase Propagacion
            System.out.println("Error capturado: " + e.getMessage());
        } finally {
            // Bloque obligatorio que se ejecuta siempre al terminar
            System.out.println("El programa ha finalizado.");
        }
    }
}