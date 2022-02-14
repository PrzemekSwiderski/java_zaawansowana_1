package dzien5.funcional;

@FunctionalInterface
public interface Watchable<T> {
    void display(T objectToDisplay);
}
