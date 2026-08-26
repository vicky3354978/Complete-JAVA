class MyThread extends Thread
{
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("thread is running :"+i);
        }
    }

}


public class FirstPro {
    static void main() {
        System.out.println("hello");
        MyThread t=new MyThread();
        t.start();
    }
}
