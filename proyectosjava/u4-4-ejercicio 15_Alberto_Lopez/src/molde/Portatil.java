package molde;

public class Portatil extends Ordenador implements Portable{
private int bateria;

    public Portatil(String nombre, Boolean estado) {
        super(nombre, estado);
        this.bateria = (int)(Math.random() * 100)+1;;
    }

    public void cargarBateria(){
        this.bateria=100;
    }

    public String sleep() {
        return "El portátil cuyo nombre es " + getNombre() + " está en reposo";
    }

    public String funcionarConBateria() {
        String resultado;
        if (bateria > 20) {
            resultado="El portátil cuyo nombre es " + super.getNombre() +
                    " está funcionando con batería a un estado de la batería cuyo valor es " + bateria;
        } else {
            resultado="La batería es demasiado baja para funcionar";
        }
        return resultado;
    }
}
