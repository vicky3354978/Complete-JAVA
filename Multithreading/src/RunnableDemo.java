 class UsingRunnable implements Runnable {
    public void run()
    {
        System.out.println("hello "+Thread.currentThread().getName());
    }

}
public class RunnableDemo
{
    static void main() {
        UsingRunnable r = new UsingRunnable();

        Thread t1 = new Thread(r);
        //thread class ka use karna hi ho ga because start method Thread class mai hi hai
        t1.start();
    }
}
