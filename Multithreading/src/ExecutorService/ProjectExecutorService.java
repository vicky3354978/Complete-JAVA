package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProjectExecutorService {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(() -> readUserData());
        executorService.submit(() -> readOrderedData());
        executorService.submit(() -> callPaymentService());
        executorService.submit(() -> readFromCache());
        executorService.submit(() -> readFromFile());
        executorService.submit(() -> callingNotificationService());

        executorService.shutdown();
    }

    public static void readUserData() {
        System.out.println("Reading User data from DB");
        sleep(300000);
        System.out.println("User DB read complete");
    }

    public static void readOrderedData() {
        System.out.println("Reading User order from DB");
        sleep(2000);
        System.out.println("Order DB read complete");
    }

    public static void callPaymentService() {
        System.out.println("Calling payment service");
        sleep(1500);
        System.out.println("Payment service response received");
    }

    public static void readFromCache() {
        System.out.println("Reading from cache");
        sleep(1500);
        System.out.println("Cache read completed");
    }

    public static void readFromFile() {
        System.out.println("Reading data from file");
        sleep(1500);
        System.out.println("Reading data is completed");
    }

    public static void callingNotificationService() {
        System.out.println("Calling Notification Service");
        sleep(3000);
        System.out.println("Notification service response received");
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}