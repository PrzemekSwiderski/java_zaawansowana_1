package dzien10;

public class WithdrawDepositExample {
    public static void main(String[] args) {
        Client client = new Client();
        Thread withdrawingThread = new Thread(new WithdrawingTread(client));
        Thread depositeThread1 = new Thread(new DepositeThread(client));
        Thread depositeThread2 = new Thread(new DepositeThread(client));

        withdrawingThread.start();
        depositeThread1.start();
        depositeThread2.start();

    }
}

class Client {
    private int account = 0;

    synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println("trying to withdraw");
        while (account < amount) {

            System.out.println("withdraw not passed");
            wait();
        }
        account -= amount;
        System.out.println("Withdraw " + amount + " money");


    }

    synchronized void deposite(int amount) {
        account += amount;
        System.out.println("Trying to deposit " + amount + " money");
        notify();
    }
}

class WithdrawingTread implements Runnable {

    private Client client;

    public WithdrawingTread(Client client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            client.withdraw(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DepositeThread implements Runnable {

    private Client client;

    public DepositeThread(Client client) {
        this.client = client;
    }

    @Override
    public void run() {
        client.deposite(500);
    }
}