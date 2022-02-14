package dzien3.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Customer> shopQueue = new ArrayList<>();

    public void addCustomer(Customer customer) {
        shopQueue.add(customer);
    }

    public void showQueue() {
        System.out.println(shopQueue);
    }

    public void sortCustomerByName(){
        shopQueue.sort(new NameComparator());
    }

    public void sortByName2(){
        shopQueue.sort(new NameComparator().reversed());
    }

/*    public void serviceTheCustomer() {
        if (shopQueue.isEmpty()) {
            System.out.println("Brak klientów w kolejce.");
        } else {
            System.out.println("obsługuję klienhta " + shopQueue.remove(shopQueue.size() - 1));
            System.out.println("aktualna kolejka: " + shopQueue);
        }
    }

    public void serviceTheCustomer(int n) {
        for (int i = 0; i < n; i++) {
            if (shopQueue.isEmpty()) {
                System.out.println("Brak klientów w kolejce.");
                break;
            } else {
                System.out.println("obsługuję klienhta " + shopQueue.remove(shopQueue.size() - 1));
                System.out.println("aktualna kolejka: " + shopQueue);
            }
        }
    }*/

}
