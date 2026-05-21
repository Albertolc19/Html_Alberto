package model;

import java.util.LinkedList;

public class Banco {
    private String direccion;
    private String ciudad;
    private LinkedList<Empleado> empleados;

    public Banco(String direccion, String ciudad) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        empleados = new LinkedList<>();
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public String mostrarEmpleados() {
        StringBuilder datos = new StringBuilder();
        for(Empleado e:empleados){
            datos.append(e.toString());
        }
        return datos.toString();
    }

    public void setEmpleados(Empleado e) {
        this.empleados.add(e);
    }

}

