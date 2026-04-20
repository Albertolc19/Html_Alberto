//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nrandom = 1;
        Double sumanotas= 0.0;
        int nminima=10;
        int nmaxima=0;
        int vecesnmin=0;
        int vecesnmax=0;
        for (int contador = 1; contador <= 30; contador++) {
            nrandom = (int) (Math.random() * 10) + 1;
            sumanotas += nrandom;
            if (nrandom < nminima)
                nminima = nrandom;
            if (nrandom > nmaxima)
                nmaxima = nrandom;
            if(nrandom>nmaxima){
                vecesnmin=1;
            }else {
                if (nrandom == nmaxima)
                    vecesnmax++;
            }
            if (nrandom<nminima){
                vecesnmin=1;
            }else{ if (nrandom==nminima)
                    vecesnmin++;
            }

            if (contador <= 29)
                System.out.print(nrandom + ", ");
            else
                System.out.print(nrandom + ".");
        }
        System.out.println("\nLa nota media es "+sumanotas/30);
        System.out.println("La nota minima es "+nminima);
        System.out.println("La nota maxima es "+nmaxima);
        System.out.println("La cantidad de veces que salio la nota maxima es de "+vecesnmax+" y la nota minima es de "+vecesnmin);
    }
}