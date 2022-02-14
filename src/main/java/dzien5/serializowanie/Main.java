package dzien5.serializowanie;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Book book = new Book(1, "Pan Tadeusz", "Adam Mickiewicz");
//        FileOutputStream fileOutputStream = new FileOutputStream("book.txt");
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(book);
//
//        fileOutputStream.flush();
//        objectOutputStream.flush();
//        System.out.println(book);
//
//        FileInputStream fileInputStream = new FileInputStream("book.txt");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        Book deserialBook = (Book) objectInputStream.readObject();
//        objectInputStream.close();
//
//        System.out.println(deserialBook);


        //serialization
        Book book = new Book(1, "Pan Tadeus", "Adam Mickiewicz");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("book.txt")));
        objectOutputStream.writeObject(book);
        objectOutputStream.close();
        //deserialization
        ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get("book.txt")));
        Book deserializedBook = (Book) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(deserializedBook);


    }
}
