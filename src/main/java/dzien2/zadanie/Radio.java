package dzien2.zadanie;

public class Radio extends ElectronicDevice implements Sound{

    int minFrequency;
    int maxFrequency;


    public Radio(String name, int price, CaseColor color, int minFrequency, int maxFrequency){
        super(name, price, color);
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
    }

    @Override
    void enable() {
        System.out.println("Radio " + getName() + " zostałp włączone");
    }

    @Override
    void disable() {
        System.out.println("Radio " + getName() + " zostało wyłączone");
    }

    @Override
    public void increase() {
        System.out.println("Pogłośniłeś radio " + getName());
    }

    @Override
    public void decrease() {
        System.out.println("ściszyłeś radio " + getName());
    }


    public int getMinFrequency() {
        return minFrequency;
    }

    public int getMaxFrequency() {
        return maxFrequency;
    }

}
