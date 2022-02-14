package dzien1.abstractClasses;

public class Cat extends Animal implements Flying, Sound<String> {

    void purr() {
        System.out.println("Purrrr purrrr");
    }

    @Override
    void eat() {

    }

    @Override
    void drink() {

    }

    @Override
    public void raise() {
        System.out.println("Ten kot lata?!");
    }

    @Override
    public void land() {
        System.out.println("A teraz ląduje");
    }

    @Override
    public int range(){
        return 5;
    }

    @Override
    public String beeingSatisfacted() {
        return "Purrrpurrr Purr";
    }

    @Override
    public void beeingAngry() {
        System.out.println("Hisssss");
    }

    class Fur{
        String color = "Czarny";
        int length;
    }

    static class Whisker{
        String color;
        int lenght = 5;
    }

}
