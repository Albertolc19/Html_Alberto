import model.MatrizIdentidad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MatrizIdentidad a=new MatrizIdentidad();
        int[][] matriz=a.generarMatrizIdentidad(6);
        System.out.println(a.mostrarMatriz(matriz));
    }
}