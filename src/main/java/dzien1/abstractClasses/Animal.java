package dzien1.abstractClasses;

public abstract class Animal implements Flying, Sound<String> {
    int age;
    String name;

    abstract void eat();
    abstract void drink();

    void run(){
        System.out.println("Biegam");
    }

}
