package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceWithMultipleTask {
        static void main() {

            ExecutorService executor = Executors.newFixedThreadPool(3);

            Runnable task1 = () -> {
                String name = Thread.currentThread().getName();
                System.out.println("Task 1 executed by: " + name);
            };

       /* Runnable task2 = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Task 2 executed by: " + name);
        };

        Runnable task3 = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Task 3 executed by: " + name);
        };*/
            for(int i=0; i<10; i++)
            {
                executor.submit(task1);
            }
            //in this three Thread are created to exe. one task which is task one we have mentioned
            //we can write instead of this to above one this ...

/*        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);*/

            executor.shutdown();
        }
    }

