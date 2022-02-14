package dzien10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Speakers lenowvo = new Speakers();

//        Thread marioThread = new Thread(new Game(lenowvo));
//        Thread backgroundMusicThread = new Thread(new MusicPlayer(lenowvo));
//
//        marioThread.start();
//        backgroundMusicThread.start();

        List<Runnable> runnableList = new ArrayList<>();
        runnableList.add(new Game(lenowvo));
        runnableList.add(new MusicPlayer(lenowvo));

        ExecutorService threadPool = Executors.newFixedThreadPool(runnableList.size());
        for (Runnable list : runnableList) {
            threadPool.submit(list);
        }
        threadPool.shutdown();
    }
}


class Speakers {
    boolean isBossFight = false;

    synchronized void playSoundForGames() {
        isBossFight = true;
        notify();

        while (isBossFight) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    synchronized void playSoundForMusic() {
        while (!isBossFight) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        isBossFight = false;
        notify();
    }

}

class Game implements Runnable {
    int maxStages = 5;
    int maxMapOnStage = 6;
    int stage = 1;
    int map;
    Speakers speakers;

    public Game(Speakers speakers) {
        this.speakers = speakers;
    }

    @Override
    public void run() {
        playGame();
    }

    public void playGame() {

        for (int i = 1; i <= maxStages; i++) {
            map = 1;
            for (int j = 1; j <= maxMapOnStage; j++) {
                System.out.println("Stage: " + stage + "-" + map);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (map == maxMapOnStage) {
                    System.out.println("BOSS FIGHTOOO!!!");
                    speakers.playSoundForGames();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Next stage");
                    System.out.println();

                }
                map++;

            }

            stage++;

        }
    }

//    @Override
//    public Boolean call() throws Exception {
//        playGame();
//        return true;
//    }
}

class MusicPlayer implements Runnable {

    ArrayList<String> music = new ArrayList<>();
    Speakers speakers;

    public MusicPlayer(Speakers speakers) {
        this.speakers = speakers;
    }

    private void createPlayMusic() {
        music.add("Bossfight - The Maze Of Mayonnaise");
        music.add("Bossfight - The Maze Of Mayonnaise2");
        music.add("Bossfight - The Maze Of Mayonnaise3");
        music.add("Bossfight - The Maze Of Mayonnaise4");
        music.add("Bossfight - The Maze Of Mayonnaise5");
        music.add("Bossfight - The Maze Of Mayonnaise6");

    }


    @Override
    public void run() {
        createPlayMusic();
        playMusic();
    }

    public void playMusic() {

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            speakers.playSoundForMusic();
            System.out.println("W tle leci: " + music.get(ThreadLocalRandom.current().nextInt(0, music.size())));
//random.nextInt(music.size())
        }
    }

//    @Override
//    public Boolean call() throws Exception {
//        createPlayMusic();
//        playMusic();
//        return true;
//    }
}
