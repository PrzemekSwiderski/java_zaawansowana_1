package dzien4.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readers {
    public static void main(String[] args) {
        try {
            System.out.println("test");
            FileReader in = new FileReader("user.txt");
            FileWriter out = new FileWriter("user2.txt");

            int nextChar;
            while ((nextChar = in.read()) != -1) {
                out.write((char) nextChar);
                System.out.print((char) nextChar);
            }

            out.close();
        } catch (IOException e) {
            System.out.println("Poleciał nam wyjątek");
        }finally {
            System.out.println("Finalny blok");
        }
    }
}
