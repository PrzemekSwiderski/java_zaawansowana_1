package dzien4.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
    public static void main(String[] args)  {
        FileInputStream in = null;
        try {
            in = new FileInputStream("user.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("user2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        int c =0;

        while (true) {
            try {
                if (!((c = in.read()) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.write(c);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(c);
        }


        System.out.println("♥");
    }
}
