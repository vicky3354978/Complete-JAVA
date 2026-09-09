package RunnableWithReturn;

import java.util.concurrent.*;

public class CallableDemo {
    static void main() throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Callable <Integer>email=()->
        {
            System.out.println("sending email ");
            Thread.sleep(1000);
            return 200;
        };

        Future<Integer> future =executorService.submit(email);
        int res= future.get();
        System.out.println("doing work");
        Thread.sleep(10000);
        System.out.println("work is done "+res);
        executorService.shutdown();
    }
}
