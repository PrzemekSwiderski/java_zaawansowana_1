package dzien10;

import java.util.concurrent.Callable;

public class CallableExample {


    public static void main(String[] args) {
        CallableThread callableThread = new CallableThread();
        try {
            System.out.println(callableThread.call());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class CallableThread implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "jakis text";
    }
}