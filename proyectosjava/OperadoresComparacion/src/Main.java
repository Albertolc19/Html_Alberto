//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int edadJuan = 6;
        int edadPedro = 6;
        int edadJulio = 21;
        int contador = 14;
        double hipotenusa = 206.73;
        double hipotenusaalcuadrado= hipotenusa*hipotenusa;
        double cateto1 = 13.2;
        double cateto2 = 5.7;
        double catetoalcuadrado= (cateto1*cateto1)+(cateto2*cateto2);
        System.out.println("Es " +(edadJuan<18)+ " que juan es menor de edad");
        System.out.println("Es " +(edadJuan==edadPedro)+ " que Juan tiene la misma edad que Pedro.");
        System.out.println("Es " +(edadJulio>edadPedro)+ " que Julio tiene más edad que Pedro.");
        System.out.println("Es " +(hipotenusaalcuadrado==catetoalcuadrado)+ " que la hipotenusa al cuadrado es igual a la suma de sus catetos al cuadrado.");
        System.out.println("Es " +(cateto1>cateto2)+ " que el cateto1 es mayor que el cateto2.");
        System.out.println("Es " +(contador==8)+ " que contador es igual a 8.");
        System.out.println("Es " +(contador!=8)+ " que contador es distinto a 8.");

    }
}