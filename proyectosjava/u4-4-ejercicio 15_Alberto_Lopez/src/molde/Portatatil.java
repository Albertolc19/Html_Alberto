package molde;

public class Portatatil extends Ordenador implements Portable{
private int bateria;

    public Portatatil(String nombre, Boolean estado) {
        super(nombre, estado);
        this.bateria = (int)(Math.random() * 100)+1;;
    }

    @Override
    public void usarBateria() {

    }
    public String sleep() {
        return "El portátil cuyo nombre es " + getNombre() + " está en reposo";
    }
}
