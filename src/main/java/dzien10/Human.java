package dzien10;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Human implements  Runnable{
    private int levelOfHunger = 0;
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        eat();
    }

    private void eat() {
        System.out.println(name + " zjadł posiłek. Om-niom-niom!");
        levelOfHunger++;
        System.out.println(name + " zjadł już " + levelOfHunger + " posiłki/ów.");
        if (levelOfHunger == 5){
            System.out.println(name + " się najadł i jest szczęśliwy.");
        }
    }

    public static void main(String[] args) {
        Human areczek = new Human("Areczek");

        ScheduledExecutorService exeServ = Executors.newScheduledThreadPool(5);
        exeServ.scheduleAtFixedRate(areczek, 0, 3, TimeUnit.SECONDS);

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exeServ.shutdown();

    }


}
