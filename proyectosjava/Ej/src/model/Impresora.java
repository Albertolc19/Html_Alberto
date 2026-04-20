package model;

public class Impresora extends Dispositivo{
    private String tipoImpresora;
    private int paginas;

    public Impresora(String modelo, String tipoImpresora, int paginas) {
        super(modelo);
        this.tipoImpresora = tipoImpresora;
        this.paginas = paginas;
    }
    @Override
    public double prestaciones(){
        int pag=paginas;
        while(pag>=100){
            setNivelUso(getNivelUso()+1);
            pag-=100;
        }
        double prestaciones=0;
        prestaciones=paginas+getNivelUso();
        return prestaciones;
    }
}
