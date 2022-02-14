package dzien2.zadanie;

import java.io.Serializable;

public class Phone extends ElectronicDevice implements Sound, Serializable {

    String soft;
    Screen screen;

    public Phone() {
    }

    public Phone(String name, int price, CaseColor color, String soft, int resolution, int height, int width) {
        super(name, price, color);
        this.soft = soft;
        this.screen = new Screen(resolution, height, width);
    }

    @Override
    public String toString() {
        return "Phone{" + "name=" + getName() +
                ", soft='" + soft + '\'' +
                ", screen=" + screen +
                '}';
    }

    @Override
    void enable() {
        System.out.println("Teleofon " + getName() + " został włączony");
    }

    @Override
    void disable() {
        System.out.println("Teleofon " + getName() + " został wyłączony");
    }

    @Override
    public void increase() {
        System.out.println("Pogłośniłeś telefon " + getName());
    }

    @Override
    public void decrease() {
        System.out.println("ściszyłeś telefon " + getName());
    }

    public void screenRefresh() {
        screen.refresh();
    }

    public String getSoft() {
        return soft;
    }

    public Screen getScreen() {
        return screen;
    }

    class Screen implements DisplayVideo, Serializable {
        int resolution;
        int height;
        int width;

        public Screen(int resolution, int height, int width) {
            this.resolution = resolution;
            this.height = height;
            this.width = width;
        }

        @Override
        public String toString() {
            return "Screen{" +
                    "resolution=" + resolution +
                    ", height=" + height +
                    ", width=" + width +
                    '}';
        }

        @Override
        public void refresh() {
            System.out.println("Odświeżono ekran");
        }
    }


}
