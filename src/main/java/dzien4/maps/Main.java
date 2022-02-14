package dzien4.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Franek", "Nowak");
        Student student2 = new Student("Janek", "Kowal");
        Student student3 = new Student("Emil", "Malinowski");
        Student student4 = new Student("Franek", "Nowak");

        Map<Student, String> mapaSt = new HashMap<>();

        mapaSt.put(student1, "hej to ja Franek");
        mapaSt.put(student2, "hej to ja Janek");
        mapaSt.put(student3, "hej to ja Emil");
        mapaSt.put(student4, "hej to ja Franek");

        for (Map.Entry<Student, String> pair: mapaSt.entrySet()) {
            System.out.println(pair);
        }

        System.out.println("=======");
        for (String value: mapaSt.values()) {
            System.out.println(value);
        }
        System.out.println("=======");

        for (Student key: mapaSt.keySet()            ) {
            System.out.println(key);
        }
        System.out.println("====2===");


        System.out.println(mapaSt.entrySet());

        System.out.println(mapaSt.keySet());
        System.out.println(mapaSt.values());
        System.out.println(mapaSt.containsKey(student4));
        System.out.println(mapaSt.containsKey(new Student("Franek", "Nowak")));
        System.out.println(mapaSt.containsKey(new Student("2Franek", "Nowak")));
        System.out.println(mapaSt.containsValue("hej to ja Franek"));
        System.out.println("=====");
        System.out.println(mapaSt.get(student1));

    }
}
