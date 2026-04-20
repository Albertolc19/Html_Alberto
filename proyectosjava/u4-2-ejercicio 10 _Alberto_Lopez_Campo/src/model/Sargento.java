package model;

public class Sargento extends Militar{
    private int nPersonasCargo=0;

    public Sargento(String dni, String nombre, int edad, int nPersonasCargo) {
        super(dni, nombre, edad);
        this.nPersonasCargo = nPersonasCargo;
    }
    public String  realizarEntrenamiento(){
        if(nPersonasCargo>=20){
        setResistencia(getResistencia()+15);
        return"El Sargento ha entrenado y ha aumentado su resistencia 15 puntos";
        }
        return"El Sargento no ha podio entrenar porque no tenia las personas suficientes a cargo";
    }

    public int getnPersonasCargo() {
        return nPersonasCargo;
    }

    public void setnPersonasCargo(int nPersonasCargo) {
        this.nPersonasCargo = nPersonasCargo;
    }
}
