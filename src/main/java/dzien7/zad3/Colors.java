package dzien7.zad3;

import java.io.IOException;
import java.util.Scanner;

public class Colors {
    public static String chooseColor() throws IOException, ZielonyException {
        String color = new Scanner(System.in).nextLine();
        if (color.equalsIgnoreCase("czerwony")){
            throw new IOException();
        }else if(color.equalsIgnoreCase("zielony")){
            throw new ZielonyException();
        }


        return color;
    }


    public static void main(String[] args) {

        try {
            System.out.println(chooseColor());
        } catch (IOException e) {
            System.out.println("Czerwony");
        } catch (ZielonyException e) {
            System.out.println("Zielony");
        }
    }
}
