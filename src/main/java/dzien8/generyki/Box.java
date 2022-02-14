package dzien8.generyki;

public class Box<T extends Toy> {
    private final T toy;
    private String test;
    int abc;

    public Box(T toy) {
        this.toy = toy;
    }

    void playWithMe() {
        toy.playWithMe();
    }

    void method(String cos, int abc){
        System.out.println("blabla");
    }

}

abstract class Toy {
    abstract void playWithMe();
}

class Teddy extends Toy {
    @Override
    void playWithMe() {
        System.out.println("Pobaw się z misiem.");
    }
}

class Doll extends Toy {
    @Override
    void playWithMe() {
        System.out.println("Nie wstydź się. Pobaw się lalką.");
    }
}

class SecondMain {
    public static void main(String[] args) {
        Teddy teddy = new Teddy();
        Box<Teddy> teddyBox = new Box<>(teddy);
        teddyBox.playWithMe();
    }
}