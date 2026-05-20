import model.ListinTelefonico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListinTelefonico miListin = new ListinTelefonico();

        miListin.introducirNumero("Pepe", "600111222");
        miListin.introducirNumero("Maria", "600333444");
        miListin.introducirNumero("Juan", "600111222"); // Mismo número que Pepe para probar el punto c
        miListin.introducirNumero("Lucas", "600555666");

        System.out.println("--- Prueba buscarNumero (por nombre) ---");
        String nombreABuscar = "Maria";
        String telEncontrado = miListin.buscarNumero(nombreABuscar);
        System.out.println("El teléfono de " + nombreABuscar + " es: " + telEncontrado);

        System.out.println("El teléfono de Batman es: " + miListin.buscarNumero("Batman"));
        System.out.println();

        System.out.println("--- Prueba devolverNombres (por número) ---");
        String numeroABuscar = "600111222";
        String nombresAsociados = miListin.devolverNombres(numeroABuscar);

        System.out.print("Personas con el número " + numeroABuscar + ":");
        System.out.println(nombresAsociados);
        System.out.print("Personas con el número 999: " + miListin.devolverNombres("999"));


    }
}