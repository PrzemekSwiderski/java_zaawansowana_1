package dzien2.zadanie;

public class Main {
    public static void main(String[] args) {
        CaseColor dark = CaseColor.BLACK;
        CaseColor light = CaseColor.SILVER;

        Phone.Screen screen = new Phone().new Screen(1080, 1920, 1080);

        Phone phone = new Phone("Samsung S9", 999, dark,
                "Android",1080, 1920, 1080);

        Radio radio = new Radio("Philips 3090z", 39, light,
                20, 20000);

        phone.disable();
        phone.enable();
        phone.decrease();
        phone.increase();
        System.out.println("--------------------");

        radio.disable();
        radio.enable();
        radio.decrease();
        radio.increase();

        System.out.println("--------------------");
        phone.screenRefresh();


    }
}
