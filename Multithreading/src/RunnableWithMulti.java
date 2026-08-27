class MyTask implements Runnable
{

    @Override
    public void run() {
        for (int i=1; i<6; i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
            //in the case of thread we can not get a fixed output it is vary to thread schedular
        }
    }
}
public class RunnableWithMulti {
    static void main() {
        MyTask task=new MyTask();
        Thread t1=new Thread(task);
        t1.start();
        Thread t2=new Thread(task);
        t2.start();


    }
}
