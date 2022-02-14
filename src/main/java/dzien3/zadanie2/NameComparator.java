package dzien3.zadanie2;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class NameComparator implements Comparator<Customer> {

    private Collator poland = Collator.getInstance(new Locale("pl", "PL"));


    @Override
    public int compare(Customer o1, Customer o2) {
        return poland.compare(o1.getName(),o2.getName());
    }

    @Override
    public Comparator<Customer> reversed() {
        return Comparator.super.reversed();
    }
}
