package dzien1.oop.inheritance;

public class Opel extends Car {

    Opel(){}

    Opel(String model, String color) {
        super(model, color);
    }

    @Override
    void drive() {
        System.out.println("Jedzie Opel");
    }
}
