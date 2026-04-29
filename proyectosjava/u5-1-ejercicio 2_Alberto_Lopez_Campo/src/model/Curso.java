package model;

public class Curso {
    private static final int MAX_ESTUDIANTES = 20;
    private static final int MAX_ASIGNATURAS = 6;
    private int[][] notas;

    public Curso() {
        inicializar();
    }

    public void inicializar() {
        notas = new int[MAX_ASIGNATURAS][MAX_ESTUDIANTES];
        for (int i = 0; i < MAX_ASIGNATURAS; i++) {
            for (int a = 0; a < MAX_ESTUDIANTES; a++)
                notas[i][a] = (int) (Math.random() * 10 + 1);
        }
    }

    public String hacerMedia() {
        int SumaMedia = 0;
        String resultado="";
        for (int i = 0; i < MAX_ASIGNATURAS; i++) {
            for (int a = 0; a < MAX_ESTUDIANTES; a++) {
                SumaMedia+=notas[i][a];
            }
            resultado+="\nLa asignatura:"+i+" tiene una media de: "+(SumaMedia/MAX_ESTUDIANTES);
            SumaMedia=0;
        }
        return resultado;
    }

    public String mostrarNotas() {
        String resultado = "";

        for (int i = 0; i < MAX_ASIGNATURAS; i++) {
            resultado += "\nAsignatura " + i + ": ";

            for (int a = 0; a < MAX_ESTUDIANTES; a++) {
                resultado += notas[i][a] + " ";
            }
        }

        return resultado;
    }

}
