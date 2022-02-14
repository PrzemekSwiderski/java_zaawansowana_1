package dzien1.oop.inheritance;

public class CarExample {
    public static void main(String[] args) {
        BMW bmw = new BMW("e36", "Black", 20);
        bmw.drive();
        System.out.println(bmw.getModel());

        Opel opel = new Opel();
        opel.drive();

        Car test = new BMW("e36", "Pink", 20);
        test.drive();
        System.out.println();
    }
}
