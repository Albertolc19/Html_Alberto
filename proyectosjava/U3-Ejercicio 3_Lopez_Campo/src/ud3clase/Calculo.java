package ud3clase;

public class Calculo {
    private int precio;
    private int puntuacion;
    private int total;

    public Calculo(){
        precio=0;
        puntuacion=0;
        total=1000;
    }

    public void setPrecio(int precioCoste) {
        precio = precioCoste;
    }
    //Es un Mutador ya que cabia el valor de puntuacion y recive parametros.
    public void incrementar(int puntos){
        puntuacion+=puntos;
    }
    public void descontar(int cantidad){
        total-=cantidad;
    }
    public int getPrecio(){
        return precio;
    }
    public int getPuntuacion(){
        return puntuacion;
    }
    public int getTotal(){
        return total;
    }
}
