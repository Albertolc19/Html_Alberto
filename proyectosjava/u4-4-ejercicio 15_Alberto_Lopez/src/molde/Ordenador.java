package molde;

public class Ordenador {
    private String nombre;
    private Boolean estado;

    public Ordenador(String nombre, Boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
    public String arrancar() {
        if (estado.equals(false)) {
            estado = true;
            return"El ordenador ha arrancado.";
        } else {
            return"El ordenador ya está encendido.";
        }
    }

    public String parar() {
        if (estado.equals(true)) {
            estado = false;
            return"El ordenador se ha apagado.";
        } else {
            return"El ordenador ya está apagado.";
        }
    }

    public String ejecutarPrograma(String nombrePrograma) {
        if (estado.equals(true)) {
            return "El programa cuyo nombre es " + nombrePrograma + " se está ejecutando";
        } else {
            return "No se puede ejecutar un programa porque el ordenador está apagado.";
        }
    }
        
        public void funcionarConBateria() {
            if (bateria > 20) {
                System.out.println("El portátil cuyo nombre es " + nombre +
                        " está funcionando con batería a un estado de la batería cuyo valor es " + bateria);
            } else {
                System.out.println("La batería es demasiado baja para funcionar");
            }
    }
}
