package dzien2.zadanie2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Firm {
    List<Personel> listOfPersonel = new ArrayList<>();
    Set<String> setOfDepartment = new HashSet<>();

    public void addPersonel(Personel person) {
        listOfPersonel.add(person);
        setOfDepartment.add(person.getDepartment());
    }

    public void showPersonel() {
        for (Personel person : listOfPersonel) {
            System.out.println(person);
        }
    }

    public void showDepartment() {
        for (String department : setOfDepartment) {
            System.out.println(department);
        }
    }
}
