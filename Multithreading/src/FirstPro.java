class MyThread extends Thread
{
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("thread is running :"+Thread.currentThread().getName());
        }
    }

}


public class FirstPro {
    static void main() {
        //the main Thread is created by jvm and main Thread execute main method....
        System.out.println("hello");
        MyThread t1=new MyThread();
        t1.start();//t1 Thread created by main thread
        System.out.println(Thread.currentThread().getName());
        MyThread t2=new MyThread();
        t2.start();//this Thread also created by main Thread
        //two Threads are created Thread-0 and Thread-1
        //the Thread schedular decides which thread used to execute the program....
    }
}
