package model;

public class Test {
    public static void checkFood(String comida) throws BadFoodException {
        if (comida != null && comida.toLowerCase().contains("unhealthy")) {
            throw new BadFoodException("La comida contiene elementos categorizados como 'unhealthy'.");
        }
        System.out.println("Resultado: La comida '" + comida + "' es buena.");
    }
}
