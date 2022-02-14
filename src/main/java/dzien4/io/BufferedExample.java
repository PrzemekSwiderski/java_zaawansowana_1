package dzien4.io;

import java.io.*;

public class BufferedExample {
    public static void main(String[] args) {

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("user.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("user2.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line = null;
        int i = 0;
        while (true){
            try {
                if (!((line = in.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.write(line +"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            i++;
            System.out.println(i);
        }

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new FileReader("user.txt"));
//        BufferedWriter out = new BufferedWriter(new FileWriter("user2.txt"));
//
//        String line;
//        int i = 0;
//        while ((line = in.readLine()) != null){
//            out.write(line +"\n");
//            i++;
//            System.out.println(i);
//        }
//        out.close();
//    }
}


