package dzien10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ExecutorServceExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new ImageExecutorService().execute();
    }
}

class ImageExecutorService {
    void execute() throws ExecutionException, InterruptedException {
        List<Callable<String>> callableList = new ArrayList<>();

        callableList.add(() -> "Wątek1");
        callableList.add(() -> "Wątek2");
        callableList.add(() -> "Wątek3");
        callableList.add(() -> "Wątek4");
        callableList.add(() -> "Wątek5");

//        callableList.add(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return "Wątek1";
//            }
//        });

//        ExecutorService threadpool = Executors.newFixedThreadPool(5);
//        List<Future<String>> futures = threadpool.invokeAll(callableList);
//        for (Future<String> future : futures) {
//            System.out.println(future.get());
//        }


//        ExecutorService imageService = Executors.newFixedThreadPool(3);
//        Future<String> image = imageService.submit(new ImageRequest());
//        Future<String> image2 = imageService.submit(new ImageRequest());
//        System.out.println(image.get());
//        System.out.println(image2.get());
//        imageService.shutdown();

        DateFormat df = new SimpleDateFormat("dd:MM:yy:HH:mm:ss");

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.scheduleWithFixedDelay(() -> {
            System.out.println("Start coffee!: " + df.format(Calendar.getInstance().getTime()));

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, 1, 6,TimeUnit.SECONDS);


        //executorService.scheduleAtFixedRate - od początku czasu procesu
        //scheduleWithFixedDelay - od konica procesu

    }
}

class ImageRequest implements Callable<String> {

    public String call() {
        int a = new Random().nextInt(11);
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
        }
        return "Jakiś string";
    }
}