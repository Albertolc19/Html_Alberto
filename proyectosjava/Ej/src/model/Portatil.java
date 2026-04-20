package model;

public class Portatil extends Dispositivo implements Diacnosticable{
    private int capDisco;
    private int ram;
    private String nombreProcesador;

    public Portatil(String modelo,int capDisco, int ram, String procesador) {
        super(modelo);
        this.capDisco = capDisco;
        this.ram = ram;
        nombreProcesador = procesador;
    }

    public int getCapDisco() {
        return capDisco;
    }

    public void setCapDisco(int capDisco) {
        this.capDisco = capDisco;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getNombreProcesador() {
        return nombreProcesador;
    }

    public void setNombreProcesador(String nombreProcesador) {
        this.nombreProcesador = nombreProcesador;
    }

    @Override
    public double prestaciones() {
        double prestaciones = 0;
        if(getNivelUso()<=5){
            prestaciones=(capDisco*ram)/2;
        }else if(getNivelUso()>=5){
            prestaciones=(capDisco+ram)*2;
        }
            return prestaciones;

    }

    @Override
    public String diacnostico() {
        String resultado = "";
        int nPruebas=(int)(Math.random() * 10)+1;
        int nAleatorio;
        double suma=0;
        double resSuma=0;
        int exitosas=0;
        String es="";
        for (int i = 1; i <= nPruebas; i++) {
            nAleatorio = (int) (Math.random() * 10) + 1;
            suma = getCapDisco() * getRam();
            resSuma = suma + nAleatorio;
            if (resSuma >= 965) {
                es = "Exitosa";
                exitosas++;
            } else {
                es = "Fallida";
            }
            resultado += "Prueba: " + i + " Portatil: " + getCapDisco() + "*" + getRam() + "=" + suma + ", aleatorio: " + nAleatorio + " Resultado: " + resSuma + " -> " + es + "\n";
        }
        resultado +="Total de pruebas exitosas: "+exitosas;
        return resultado;
    }
    public String simulacionValoraciones(int nFilas, int nColumnas){
        String resultado = "";
        int nAleatorio;
        String es="";
        int exitosas=0;
        for (int i = 1; i <= nFilas; i++){
            for (int e = 1; e <= nColumnas; e++){
                nAleatorio = (int) (Math.random() * 10) + 1;
                if (nAleatorio > 5) {
                    es = "Exitosa";
                    exitosas++;
                } else {
                    es = "Fallida";
                }
                resultado+= "Valoracion ("+i+","+e+"): aleatorio "+nAleatorio+"->"+ es + "\n";
            }
        }
        resultado+="Total valoraciones positivas: "+exitosas;
        return resultado;
    }
}
