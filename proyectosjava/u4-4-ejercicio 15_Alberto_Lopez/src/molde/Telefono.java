package molde;

public class Telefono implements Portable{
private int bateria=0;
private String modelo;

    public Telefono(String modelo) {
        this.modelo = modelo;
    }

    public String hacerLlamada(String nombre, String telefono) {
        return "Se esta llamando a " + nombre + " cuyo teléfono es " + telefono;
    }

    @Override
    public void cargarBateria() {
        if (modelo.equalsIgnoreCase("Galaxy")) {
            bateria = 80;
        } else if (modelo.equalsIgnoreCase("Iphone")) {
            bateria = 90;
        } else if (modelo.equalsIgnoreCase("Huawei")) {
            bateria = 70;
        }
    }
    @Override
    public String funcionarConBateria() {
        if (bateria > 60) {
            return "El teléfono tiene batería";
        } else {
            return "El teléfono no tiene batería";
        }
    }
}
