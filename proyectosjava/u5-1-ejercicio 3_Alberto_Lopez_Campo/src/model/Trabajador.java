package model;

public class Trabajador {
    private int diasTrabajo=7;
    private int trabajadores=15;
    private int[][] horasTrabajadas;
    private static final String[] DIAS_SEMANA = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    public Trabajador() {
        horasTrabajadas=new int[diasTrabajo][trabajadores];
        RepartirHoras();
    }

    public void RepartirHoras(){
        for(int i=0;i<diasTrabajo;i++)
            for(int a=0;a<trabajadores;a++)
            horasTrabajadas[i][a]=(int) (Math.random()*5)+8;
    }

    public int[] calcularHorasPorDia() {
        int[] totalPorDia = new int[diasTrabajo];

        for (int i = 0; i < diasTrabajo; i++) {
            for (int j = 0; j < trabajadores; j++) {
                totalPorDia[i] += horasTrabajadas[i][j];
            }
        }
        return totalPorDia;
    }

    public void mostrarHorasPorDia() {
        int[] totalPorDia = calcularHorasPorDia();
        for (int i = 0; i < diasTrabajo; i++) {
            System.out.println(DIAS_SEMANA[i] + ": " + totalPorDia[i] + " horas");
        }
    }

}
