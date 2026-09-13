package trylock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TryLock
{
    public final Lock lock=new ReentrantLock();
    public void reportGen() throws InterruptedException {

        if (lock.tryLock(3, TimeUnit.SECONDS)){
            try
            {
                System.out.println(Thread.currentThread().getName());
                System.out.println("report is generating ");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();;
            }
        }

    }
}
public class Report {
    static void main() {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        TryLock t=new TryLock();
        for(int i=0; i<3;i++)
        {
            executorService.submit(()-> {
                try {
                    t.reportGen();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

        }
        executorService.shutdown();
    }
}
