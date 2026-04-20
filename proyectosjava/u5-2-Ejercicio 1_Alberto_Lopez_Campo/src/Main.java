import model.Busqueda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Busqueda buscar=new Busqueda();
        int[] prueba=new int[6];
        prueba[0]=7;
        prueba[1]=12;
        prueba[2]=32;
        prueba[3]=45;
        prueba[4]=66;
        prueba[5]=11;
        System.out.println(buscar.buscarLineal(prueba,12));
    }
}