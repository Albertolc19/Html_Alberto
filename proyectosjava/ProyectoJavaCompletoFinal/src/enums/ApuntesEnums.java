package enums;

public class ApuntesEnums {

    enum CoffeeSize {
        BIG, HUGE, OVERWHELMING
    }

    public static void ejecutar() {

        CoffeeSize size = CoffeeSize.BIG;

        System.out.println(size);

        for(CoffeeSize c : CoffeeSize.values()) {
            System.out.println(c);
        }
    }
}