import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Hacer el cambio a libra:
    public static String libra(double n1) {
        n1 = n1 * 0.87;
        return "El numero introducido convertido a libras es de " + n1;
    }

    //Hacer el cambio a dolares
    public static String dolares(double n1) {
        n1 = n1 * 1.11;
        return "El numero introducido convertido a dolares es de " + n1;

    }

    //Hacer el cambio a yenes
    public static String yenes(double n1) {
        n1 = n1 * 120.63;
        return "El numero introducido convertido a yenes es de " + n1;

    }

    //El codigo principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedir la cantidad de euros a cambiar.
        System.out.println("Introduce la canidad de euros a cambiar ");
        double cantidadEuros = sc.nextDouble();
        double converitirEuros = 0;
        String conversion;
        sc.nextLine();
        //Crear el bucle
        do {
            System.out.println("Introduce la moneda a la que quieres realizar el cambio(libra,dolares o yenes). PAra terinar el prorgama introduce FIN");
            conversion = sc.nextLine();
            switch (conversion) {
                case "libra"://Si es libra Inicializar libra.
                    System.out.println(libra(cantidadEuros));
                    break;
                case "dolares"://Si es dolares Inicializar dolares.
                    System.out.println(dolares(cantidadEuros));
                    break;
                case "yenes"://Si es yenes Inicializar yenes.
                    System.out.println(yenes(cantidadEuros));
                    break;
                case "FIN"://Si tra fin que se salga del metodo
                    break;
                default://Si trae otra cosa que ponga esto
                    System.out.println("Lo que escriviste esta mal, escrivelo de nuevo por favor.");
                    break;

            }
        } while (!conversion.equals("FIN"));
    }
}