package dzien3.zadanie2;

public class Main {
    public static void main(String[] args) {
        Shop sklep = new Shop();
        Customer magda = new Customer("Magda", 5, sklep);
        Customer kasia = new Customer("Żasia", 3, sklep);
        Customer joasia = new Customer("Ąoasia", 2, sklep);
        Customer asia = new Customer("Asia", 1, sklep);
        Customer marta = new Customer("Marta", 4, sklep);

        sklep.showQueue();

        sklep.sortCustomerByName();

        sklep.showQueue();

        sklep.sortByName2();

        sklep.showQueue();

    }

}
