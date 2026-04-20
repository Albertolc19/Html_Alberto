package model;

public class Aula {
    private String nombre;

    public Aula(String nombre) {
        this.nombre = nombre;
    }

    public String revision(Dispositivo a1, int numRevisiones) {
        String resultado = "nivel de uso incial: " + a1.getNivelUso() + "\n";
        for (int i = 0; i <= numRevisiones; i++) {
            int numAleatorio = (int) (Math.random() * 10) + 1;
            if (numAleatorio % 2 == 0) {
                a1.setNivelUso(a1.getNivelUso() + 2);
                resultado += "Revision " + i + ": Numero generado: " + numAleatorio + " Incremento: +2\n";
            } else {
                a1.setNivelUso(a1.getNivelUso() + 1);
                resultado += "Revision " + i + ": Numero generado: " + numAleatorio + " Incremento: +1\n";
            }
        }
        resultado += "nivel de uso final: " + a1.getNivelUso() + "\n";
        return resultado;
    }
public String diagnostico(Diacnosticable d1){
        return d1.diacnostico();
}

}
