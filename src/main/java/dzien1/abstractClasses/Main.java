package dzien1.abstractClasses;

public class Main {
    public static void main(String[] args) {
        Cat busia = new Cat();
        busia.name = "Busia";
        busia.run();
        busia.purr();

        Dog tobiasz = new Dog();
        tobiasz.run();

        Cat.Fur fur = new Cat().new Fur();
        System.out.println(fur.color);

        Cat.Whisker whisker = new Cat.Whisker();
        System.out.println(whisker.lenght);

        Dog.Tail tail = new Dog().new Tail();
        Dog.GoodBoy goodBoy = new Dog.GoodBoy();

        System.out.println(tail.lenght);
        System.out.println(goodBoy.isaGoodBoy);

        Cat latającaBusia = new Cat();

        latającaBusia.beeingAngry();
        System.out.println(latającaBusia.beeingSatisfacted());
        latającaBusia.askingForFood();

    }
}
