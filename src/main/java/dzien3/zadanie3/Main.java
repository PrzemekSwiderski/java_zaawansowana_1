package dzien3.zadanie3;

public class Main {

    public static void main(String[] args) {

        Client2 firstClient = new Client2(1, "Jaś", 3);
        Client2 secondClient = new Client2(2, "Kasia", 2);
        Client2 thirdClient = new Client2(3, "Zosia", 4);
        Client2 fourthClient = new Client2(4, "Ania", 1);
        Client2 fifthClient = new Client2(5, "Grześ", 5);

        Store firstStore = new Store("First Store");

        firstStore.addClient(firstClient);
        firstStore.addClient(secondClient);
        firstStore.addClient(thirdClient);
        firstStore.addClient(fourthClient);
        firstStore.addClient(fifthClient);

        firstStore.printClientList();
        firstStore.sortClients();
        firstStore.printClientList();





    }
}