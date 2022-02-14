package dzien2.listy;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Zohn");
        names.add("Neeki");
        names.add("Packia");
        names.add("John");
        names.add("Marika");

//        if (names.contains("John")){
//            System.out.println("element istnieje");
//        }

        for (String name: names
             ) {
            System.out.println(name);
        }
    }
}
