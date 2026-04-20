package model;

public class GestionEmpleados {
    public double aumentarSalario(Empleado e) {
        e.setSalario(e.getSalario() * 1.10);
        return e.getSalario();
    }

    public String mostrarDepartamento(Empleado e) {

        if (e instanceof Profesor) {
            return "Departamento de educación";
        } else if (e instanceof Secretario) {
            return "Departamento de Administración";
        } else if (e instanceof Limpiador) {
            return "Departamento de limpieza";
        }

        return "Departamento desconocido";
    }

    public int modificarExperiencia(Empleado e, int año) {
        e.setExperiencia(e.getExperiencia() + año);
        return e.getExperiencia();
    }

    public void modificarEmpleado(Empleado e) {
        if (e instanceof Profesor) {
            ((Profesor) e).setAsignaturas(((Profesor) e).getAsignaturas()+1);
        }
        if (e instanceof Secretario) {
            e.setExperiencia(e.getExperiencia() + 1);
        }
        if (e instanceof Limpiador) {
            ((Limpiador) e).setEdad(((Limpiador) e).getEdad()+1);
        }
    }
}