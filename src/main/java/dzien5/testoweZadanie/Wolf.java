package dzien5.testoweZadanie;

import java.util.HashMap;
import java.util.Map;

public class Wolf {
    private static int id = 1;
    private final int wolfId;
    private String name;
    private static HashMap<Integer, Wolf> listOfWolfs = new HashMap();

    public Wolf() {
        wolfId = id;
        id++;
    }

    public static void makeWolf() {
        listOfWolfs.put(id, new Wolf());
    }

    public static void showPack() {
        for (Map.Entry<Integer, Wolf> pack : listOfWolfs.entrySet()) {
            System.out.println(pack);
        }
    }

    public void makeSound(Barking bark){
        bark.barkBark(name);
    }

    @Override
    public String toString() {
        return "Wilk " + wolfId + " " + name;
    }


    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static HashMap<Integer, Wolf> getListOfWolfs() {
        return listOfWolfs;
    }

    public void setName(String name) {
        this.name = name;
    }
}
