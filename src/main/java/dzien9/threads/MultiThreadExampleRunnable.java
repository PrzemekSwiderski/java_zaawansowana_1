package dzien9.threads;

public class MultiThreadExampleRunnable {
    public static void main(String[] args) {
        Drinks drink = new Drinks();
        Books book = new Books();

        Thread drinkingThread = new Thread(drink);
        Thread bookThread = new Thread(book);

        drinkingThread.start();
        bookThread.start();
    }
}


class Drinks implements  Runnable {
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

class Books implements  Runnable {
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