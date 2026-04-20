//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String equipo1 = "Barcelona";
        String equipo2 = new String("Barcelona");
        String equipo3 = "Barcelona";
        String equipo4 = "barcelona";
        //Es true porque primero lee el equipo 1 y luego el 2 entrando solo en la celda de memoria la cual entra después de saber el dato 1
        System.out.println(equipo1.equals(equipo2));
        //Es true porque ninguno esta en una celda y solo los compara.
        System.out.println(equipo1.equals(equipo3));
        //Daria false porque no son igaules ya que uno tinene una b minúscula y aparte están en celadas distintas.
        System.out.println(equipo1.equals(equipo4));
        //Seria falso porque no guarda la inforación en ningún lado y se pierde.
        equipo1.toLowerCase();
        System.out.println(equipo1.equals(equipo4));
        //Estaría bien porque las 2 son iguales.
        equipo1=equipo1.toLowerCase();
        System.out.println(equipo1.equals(equipo4));
    }
}