class MyThreadP implements Runnable
{
    @Override
    public void run() {
        for(int i=0;i<100; i++)
        {
            System.out.println("this line executed by "+Thread.currentThread().getName());
        }
    }
}
public class ThreadPriority {
    static void main() {
        Thread t1=new Thread(new MyThreadP(),"MyThread-1");
        //we can change ThreadName directly in Thread class ......
        Thread t2=new Thread(new MyThreadP(),"MyThread-2");
        t1.setPriority(MyThread.MIN_PRIORITY);//-->1
        t2.setPriority(MyThread.MAX_PRIORITY);//-->10
        t1.start();
        t2.start();
        //we can set priority of Thread but at this point it is also decided by Thread schedular
    }
}
