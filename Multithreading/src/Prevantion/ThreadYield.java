package Prevantion;

class Computer extends Thread
{
    public Computer(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<10; i++)
        {
            System.out.println(getName()+"Computer using by "+i);
            Thread.yield();
            /*Important points
            yield() does not guarantee that the current thread will stop.
                It only gives a hint/request to the thread scheduler.
                The scheduler may ignore the request.
                The thread remains in the RUNNABLE state; it does not go into WAITING or BLOCKED.
            yield() is a static method, so it is called as:*/

            /*Thread.yield() is a static method that hints to the thread scheduler that the current
            thread is willing to temporarily give other runnable threads an opportunity to execute.*/
        }
    }
}
public class ThreadYield {
    static void main() {
        Computer c1=new Computer("f1");
        Computer c2=new Computer("f2");
        c1.start();
        c2.start();
        

    }
}
