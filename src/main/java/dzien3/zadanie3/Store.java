package dzien3.zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private String name;
    private List<Client2> clientList = new ArrayList<>();

    public Store(String name) {
        this.name = name;
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

    public void addClient(Client2 client) {
        clientList.add(client);
    }

//    public void serveClient() {
//        clientList.poll();
//    }

    public void printClientList() {
        System.out.println(clientList);
    }

    public void sortClients() {
        clientList.sort(new ClientComparator());
    }
}