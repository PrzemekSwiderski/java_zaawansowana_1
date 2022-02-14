package dzien5.zadanie2;

import dzien2.zadanie.CaseColor;
import dzien2.zadanie.Phone;

import java.io.*;

public class Zad2 {

/*    public Phone(String name, int price, CaseColor color, String soft, int resolution, int height, int width) {
        super(name, price, color);
        this.soft = soft;
        this.screen = new Phone.Screen(resolution, height, width);
    }*/

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Phone samsung = new Phone("S9", 999, CaseColor.BLACK, "android", 1080, 1080, 1920);

        FileOutputStream fileOutputStream = new FileOutputStream("phone.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(samsung);
        fileOutputStream.flush();
        objectOutputStream.flush();

        System.out.println(samsung);

        FileInputStream fileInputStream = new FileInputStream("phone.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Phone decodedPhone = (Phone) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(decodedPhone);

    }
}
