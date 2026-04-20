package model;

public class Producto {
    private String nombre;

    public Producto(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String registrar() {
        return "El producto independientemente de su tipo y cuyo nombre es "+nombre+" se ha registrado correctamente.";
    }


}
