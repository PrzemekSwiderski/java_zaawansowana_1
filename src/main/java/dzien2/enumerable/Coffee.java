package dzien2.enumerable;

public enum Coffee {
    LATTE(10, Roast.BLONDE, 12),
    ESPRESSO(0, Roast.DARK, 5),
    AMERICANO(5, Roast.MEDIUM, 6),
    CAPPUCCINO(7,Roast.BLONDE, 8);

    private final int milk;
    private final Roast roast;
    private final int price;


    Coffee(int milk, Roast roast, int price) {
        this.milk = milk;
        this.roast = roast;
        this.price = price;
    }

    public int getMilk() {
        return milk;
    }

    public Roast getRoast() {
        return roast;
    }

    public int getPrice() {
        return price;
    }

    public void makeCoffee(){
        double price = 1.2 * milk + this.price;
        System.out.println(price);
    }

}

enum Roast {
    BLONDE,
    MEDIUM,
    DARK
}