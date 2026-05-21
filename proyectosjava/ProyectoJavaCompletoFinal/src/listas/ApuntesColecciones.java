package listas;

import java.util.*;

public class ApuntesColecciones {

    public static void ejecutar() {

        // LIST
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");

        // Crear LinkedList
        LinkedList<String> tareas = new LinkedList<>();

        // add() -> añade elementos al final
        tareas.add("Estudiar Java");
        tareas.add("Hacer ejercicios");
        tareas.add("Repasar Arrays");

        // Mostrar lista
        System.out.println("Lista inicial:");
        System.out.println(tareas);

        // addFirst() -> añade elemento al principio
        tareas.addFirst("Desayunar");

        // addLast() -> añade elemento al final
        tareas.addLast("Dormir");

        System.out.println("\nDespués de addFirst y addLast:");
        System.out.println(tareas);

        // getFirst() -> obtiene primer elemento
        System.out.println("\nPrimer elemento:");
        System.out.println(tareas.getFirst());

        // getLast() -> obtiene último elemento
        System.out.println("\nÚltimo elemento:");
        System.out.println(tareas.getLast());

        // removeFirst() -> elimina primer elemento
        tareas.removeFirst();

        // removeLast() -> elimina último elemento
        tareas.removeLast();

        System.out.println("\nDespués de removeFirst y removeLast:");
        System.out.println(tareas);

        // contains() -> comprueba si existe un elemento
        System.out.println("\n¿Existe 'Estudiar Java'?");
        System.out.println(tareas.contains("Estudiar Java"));

        // size() -> número de elementos
        System.out.println("\nTamaño de la lista:");
        System.out.println(tareas.size());

        // Recorrer LinkedList con for-each
        System.out.println("\nRecorrido completo:");

        for (String tarea : tareas) {
            System.out.println(tarea);
        }

        // clear() -> elimina todos los elementos
        tareas.clear();

        // isEmpty() -> comprueba si está vacía
        System.out.println("\n¿La lista está vacía?");
        System.out.println(tareas.isEmpty());

        // SET
        Set<String> set = new HashSet<>();
        set.add("Ana");
        set.add("Ana");

        // MAP
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "David");

        System.out.println(lista);
        System.out.println(set);
        System.out.println(mapa);

        // STREAM
        lista.stream()
                .filter(s -> s.startsWith("J"))
                .forEach(System.out::println);
    }
}