package dzien9.threads;

public class MultiThreadExample {
    public static void main(String[] args) {
        Drink drink = new Drink();
        Book book = new Book();

        drink.start();
        book.start();
    }
}


class Drink extends Thread{
    private int amountOfDrunkDrink = 0;
    private final int maxAmountOfDrunkDrink = 100;

    @Override
    public void run(){
        drink();
    }

    public void drink() {
        for (int i = 0; i < maxAmountOfDrunkDrink; i++) {
            amountOfDrunkDrink++;
            System.out.println("Wypiłem " + amountOfDrunkDrink + "l napoju.");
        }
    }
}

class Book extends  Thread{
    private int numberOfReadPages = 0;
    private int maxNumberOfPages = 100;

    @Override
    public void run(){
        read();
    }

    public void read() {
        for (int i = 0; i < maxNumberOfPages; i++) {
            numberOfReadPages++;
            System.out.println("Przecyztałem " + numberOfReadPages + " stron.");
        }
    }
}