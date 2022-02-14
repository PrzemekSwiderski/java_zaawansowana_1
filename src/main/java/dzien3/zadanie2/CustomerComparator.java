package dzien3.zadanie2;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getPriority() < o2.getPriority() ? 1: -1;
    }
}
