package dzien7.zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongNumbers {

    public static int giveNumber() {

        System.out.print("Podaj liczbę: ");

        try {
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Czy ty umiesz czytać polecenie?!");
            return giveNumber();
        }
    }

    public static void main(String[] args) {
        System.out.println(WrongNumbers.giveNumber());
    }

}
