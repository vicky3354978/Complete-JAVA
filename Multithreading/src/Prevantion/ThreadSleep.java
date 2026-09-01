package Prevantion;

class Working implements Runnable
{
    @Override
    public void run() {
        try {
            System.out.println("working 9 to 5");
            Thread.sleep(3000);
            System.out.println("after working i go to sleep");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadSleep {
    static void main() {
        Working work=new Working();
        Thread t=new Thread(work);
        t.start();
    }

}
