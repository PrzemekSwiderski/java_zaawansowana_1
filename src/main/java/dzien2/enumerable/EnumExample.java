package dzien2.enumerable;

import java.util.Locale;

public class EnumExample {
    public static void main(String[] args) {
        Coffee coffee = Coffee.AMERICANO;
        coffeeMethod(coffee);

        Coffee latte = Coffee.LATTE;
        System.out.println(latte.getMilk() + " " + latte.getRoast());

        switch (coffee) {
            case LATTE:
                System.out.println("late switch");
                break;
            case AMERICANO:
                System.out.println("americano  switch");
                break;
            default:
                break;
        }

        for (Coffee cofee : Coffee.values()) {
            System.out.println(cofee.name() + " " + cofee.getMilk() + " " + cofee.getRoast());

        }

        latte.makeCoffee();

    }

    static void coffeeMethod(Coffee coffee) {
        System.out.println(coffee.name().toLowerCase());
    }
}
