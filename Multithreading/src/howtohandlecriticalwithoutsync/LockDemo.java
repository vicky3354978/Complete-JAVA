package howtohandlecriticalwithoutsync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Bank{
    private int amount;
    private int bal=1000;
    public final Lock lock=new ReentrantLock();
    void withdraw(int amount)
    {
        lock.lock();
        try
        {
            System.out.println(Thread.currentThread().getName()+" entered ");
            bal=bal-amount;
            System.out.println("after withdraw :"+bal);
        }
        finally {
            lock.unlock();
        }

    }
}
public class LockDemo {
    static void main() {
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        Bank b=new Bank();
        executorService.submit(()->b.withdraw(500));
        executorService.submit(()->b.withdraw(400));
        executorService.submit(()->b.withdraw(100));
        executorService.shutdown();

    }
}
