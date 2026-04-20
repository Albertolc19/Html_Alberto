package model;

public class Proyector extends Dispositivo implements Diacnosticable{
    private boolean hdmi;
    private Double luminosidad;

    public Proyector(String modelo, boolean hdmi, Double luminosidad) {
        super(modelo);
        this.hdmi = hdmi;
        this.luminosidad = luminosidad;
    }

    public boolean isHdmi() {
        return hdmi;
    }

    public void setHdmi(boolean hdmi) {
        this.hdmi = hdmi;
    }

    public Double getLuminosidad() {
        return luminosidad;
    }

    public void setLuminosidad(Double luminosidad) {
        this.luminosidad = luminosidad;
    }

    @Override
    public double prestaciones(){
        double prestaciones=0;
if(hdmi==true){
    prestaciones=luminosidad*2;
}else if(hdmi==false){
    prestaciones=luminosidad/3;
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
        for (int i = 1; i <= nPruebas; i++){
            nAleatorio=(int)(Math.random() * 10)+1;
            suma = getLuminosidad() + getNivelUso();
            resSuma=suma+nAleatorio;
            if(resSuma>=125){
                es="Exitosa";
                exitosas++;
            }else{
                es="Fallida";
            }
            resultado+="Prueba: " + i + " Proyector: " + getLuminosidad()+"+"+getNivelUso()+"="+suma+", aleatorio: "+nAleatorio+" Resultado: "+resSuma+" -> "+es+"\n";
        }
        resultado +="Total de pruebas exitosas: "+exitosas;
        return resultado;
    }
}
