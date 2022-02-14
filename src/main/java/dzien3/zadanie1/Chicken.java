package dzien3.zadanie1;

public class Chicken {
    private String name;
    private ChickenColor color;
    private Boolean fertile = true;

    public Chicken(String name, ChickenColor color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChickenColor getColor() {
        return color;
    }

    public void setColor(ChickenColor color) {
        this.color = color;
    }

    public Boolean getFertile() {
        return fertile;
    }

    public void setFertile(Boolean fertile) {
        this.fertile = fertile;
    }
}
