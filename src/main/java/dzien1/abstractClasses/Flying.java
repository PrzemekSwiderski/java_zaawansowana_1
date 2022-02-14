package dzien1.abstractClasses;

public interface Flying {

    void raise();

    void land();

    static int getAltitude() {
        return 10;
    }

    default int range() {
        return 10;

    }
}

