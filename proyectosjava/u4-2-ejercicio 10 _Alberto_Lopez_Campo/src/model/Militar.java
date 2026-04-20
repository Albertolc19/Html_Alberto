package model;

public class Militar {
    private String dni;
    private String nombre;
    private int edad;
    private int resistencia;

    public Militar(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.resistencia= (int) (Math.random( )* 100) +1;
    }

    @Override
    public String toString() {
        return "Militar{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", resistencia=" + resistencia +
                '}';
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public String participarGuerra(){
        if(getResistencia()>=70){
            return toString()+"El Militar va a participar en una Guerra";
        }
        return "El militar no tiene la resistencia necesaria";
    }
}
