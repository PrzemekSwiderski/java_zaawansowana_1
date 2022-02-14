package dzien1.oop.inheritance;

public class BMW extends Car {

    int wheelDiameter;

    BMW(String model, String color, int wheelDiameter) {
        super(model, color);
        this.wheelDiameter = wheelDiameter;
    }

    @Override
    void drive() {
        System.out.println("Jedzie BMW");
    }
}
