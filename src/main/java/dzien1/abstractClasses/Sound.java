package dzien1.abstractClasses;

public interface Sound<T> {

    T beeingSatisfacted();

    void beeingAngry();

    default void askingForFood() {
        System.out.println("Daj mnie jeść.");
    }

    static int pitch(){
        return 20;
    }

}
