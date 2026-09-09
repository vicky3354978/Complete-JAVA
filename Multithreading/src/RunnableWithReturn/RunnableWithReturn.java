package RunnableWithReturn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableWithReturn {
    static void main() {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Runnable emailTask=()->
        {
            System.out.println("email send"+Thread.currentThread().getName());
        };
        executorService.submit(emailTask);
        executorService.shutdown();

    }
}
