class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class RunnablePractice
{
    static void main() {
        MyRunnable t=new MyRunnable();
        Thread t1=new Thread(t);
        t1.start();
    }
}