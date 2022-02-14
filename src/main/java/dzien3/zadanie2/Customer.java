package dzien3.zadanie2;

import java.util.Comparator;

public class Customer {
    private String name;
    private Integer priority;

    public Customer(String name, Integer priority, Shop shop) {
        this.name = name;
        this.priority = priority;
        shop.addCustomer(this);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
