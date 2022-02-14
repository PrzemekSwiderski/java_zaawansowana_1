package dzien8.generyki;

public class Cup <T extends Liquid>{
    private final T liquid;
    public Cup (T liquid){
        this.liquid= liquid;
    }
    void drink(){
        liquid.drink();
    }
}

abstract class Liquid{
    abstract void drink();
}

class Tea extends Liquid{
    @Override
    void drink(){
        System.out.println("Popijam herbatę.");
    }
}

class  Coffee extends Liquid{
    @Override
    void drink(){
        System.out.println("Popijam kawę.");
    }
}

class Main{
    public static void main(String[] args) {
        Tea tea = new Tea();
        Cup<Tea> cup= new Cup<>(tea);
        cup.drink();

        Coffee coffee = new Coffee();
        Cup<Coffee> coffeeCup = new Cup<>(coffee);
        coffeeCup.drink();

    }
}