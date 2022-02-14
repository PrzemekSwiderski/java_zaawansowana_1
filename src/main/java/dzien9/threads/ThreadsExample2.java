package dzien9.threads;

public class ThreadsExample2 {
    public static void main(String[] args) {
        final Pair pair = new Pair(0, 0);
        new Thread(new DummyPairIncrementer(pair, "1")).start();
        new Thread(new DummyPairIncrementer(pair, "2")).start();
    }
}

class Pair {
    private Integer left;
    private Integer right;

    public Pair(final Integer left, final Integer right) {
        this.left = left;
        this.right = right;
    }


    public void incrementLeft() {
        synchronized (this) {
            left++;
        }
    }

    public void incrementRight() {
        synchronized (this) {
            right++;
        }
    }

    public Integer getLeft() {
        return left;
    }

    public Integer getRight() {
        return right;
    }
}

class DummyPairIncrementer implements Runnable {
    private final Pair pair;
    private final String threadName;

    public DummyPairIncrementer(final Pair pair, String threadName) {
        this.pair = pair;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int idx = 0; idx < 100; idx++) {
            pair.incrementLeft();
            pair.incrementRight();

        }
        System.out.println("Watek: " + threadName + " | " + pair.getLeft() + " " + pair.getRight());
    }
}

