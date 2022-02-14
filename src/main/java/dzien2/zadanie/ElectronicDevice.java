package dzien2.zadanie;

import java.io.Serializable;

public abstract class ElectronicDevice implements Serializable {
    private String name;
    private  int price;
    private CaseColor color;

    public ElectronicDevice(){
    }

    public ElectronicDevice(String name, int price, CaseColor color){
        this.name = name;
        this.price = price;
        this.color = color;
    }

    abstract void enable();

    abstract void disable();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public CaseColor getColor() {
        return color;
    }
}
