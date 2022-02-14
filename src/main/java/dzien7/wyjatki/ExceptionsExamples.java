package dzien7.wyjatki;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsExamples {
    public static void main(String[] args) {
        try {
            new ExceptionsExamples().method1();

        } catch (FileNotFoundException e) {
            System.out.println("test");
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("123");

    }

    void method1() throws IOException {
        method2();
    }

    void method2() throws IOException {
        method4();
        method3();
    }

    void method4() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    void method3() throws IOException {
        throw new IOException();
    }

}
