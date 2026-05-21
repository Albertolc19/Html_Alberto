import model.Banco;
import model.Empleado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// 1. Crear banco
    Banco banco = new Banco(
            "Calle Principal 25",
            "Madrid"
    );

    // 2. Crear 5 empleados
    Empleado e1 = new Empleado(
            "11111111A",
            "David",
            "Programador",
            2500
    );

    Empleado e2 = new Empleado(
            "22222222B",
            "Ana",
            "Diseñadora",
            2200
    );

    Empleado e3 = new Empleado(
            "33333333C",
            "Luis",
            "Administrador",
            2100
    );

    Empleado e4 = new Empleado(
            "44444444D",
            "Carlos",
            "Contable",
            2400
    );

    Empleado e5 = new Empleado(
            "55555555E",
            "Laura",
            "RRHH",
            2300
    );
    banco.setEmpleados(e1);
    banco.setEmpleados(e2);
    banco.setEmpleados(e3);
    banco.setEmpleados(e4);
    banco.setEmpleados(e5);
    // 4. Mostrar lista empleados
    System.out.println("LISTA EMPLEADOS:");
    System.out.println(banco.mostrarEmpleados());

    // 5. Mostrar tamaño lista
    System.out.println("\nTamaño lista:");
    System.out.println(
            banco.getEmpleados().size()
    );

    // 6. Crear nuevo empleado
    Empleado nuevoEmpleado = new Empleado(
            "66666666F",
            "Marta",
            "Directora",
            4000
    );

    // 7. Añadir empleado en posición 2
    banco.getEmpleados().add(2, nuevoEmpleado);

    // 8. Mostrar lista actualizada
    System.out.println("\nLISTA ACTUALIZADA:");
    System.out.println(banco.mostrarEmpleados());

    // 9. Mostrar tamaño actualizado
    System.out.println("\nNuevo tamaño:");
    System.out.println(
            banco.getEmpleados().size()
    );

    // 10. Borrar 1 empleado
    banco.getEmpleados().remove(e3);

    // 11. Mostrar lista tras borrar
    System.out.println("\nLISTA TRAS BORRAR:");
    System.out.println(banco.mostrarEmpleados());

    // 12. Mostrar tamaño final
    System.out.println("\nTamaño final:");
    System.out.println(
            banco.getEmpleados().size()
    );

    // 13. Comprobar si existe empleado
    System.out.println(
            "\n¿Existe Ana en la lista?"
    );

    System.out.println(
            banco.getEmpleados().contains(e2)
    );

}

