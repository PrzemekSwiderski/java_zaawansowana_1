package dzien7.zad1;

import java.util.Scanner;

public class Root {


    public static int takeNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public boolean rootExeption(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double division(int a, int b) {
        double result = 0;

        try {
            result = ((double) a)/ b;
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez 0, cholero!");
        }
            return result;


    }

    public static void main(String[] args) {
        System.out.println(Root.division(Root.takeNumberFromUser(), Root.takeNumberFromUser()));
    }

}
