package model;

public class Curso {
    private static final int MAX_ESTUDIANTES = 20;
    private static final int MAX_ASIGNATURAS = 6;
    private int[][] notas;
    public Curso() {
    }
    public void inicializar(){
        notas=new int[MAX_ESTUDIANTES][MAX_ASIGNATURAS];
        for(int i=0;i<MAX_ESTUDIANTES;i++){
            notas[i][]=(int) (Math.random() * 10 + 1);
        }
    }
}
