package dzien1.oop.inheritance;

public abstract class Car {
    private String model;
    private String color;

    Car(){}

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }


    abstract void drive();

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
