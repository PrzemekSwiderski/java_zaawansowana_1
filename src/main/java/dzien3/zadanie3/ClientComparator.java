package dzien3.zadanie3;

import java.util.Comparator;

public class ClientComparator implements Comparator<Client2> {
    @Override
    public int compare(Client2 o1, Client2 o2) {
        if (o1.getPriority() < o2.getPriority()){
            return 1;
        } else {
            return -1;
        }

    }
}