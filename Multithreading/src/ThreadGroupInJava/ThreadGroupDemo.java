package ThreadGroupInJava;
class MyThread extends Thread{
    public MyThread(ThreadGroup apiGroup, String name)
    {
        super(apiGroup,name);
    }

    @Override
    public void run() {
        System.out.println("Thread name : "+Thread.currentThread().getName()+" Group"
                +Thread.currentThread().getThreadGroup().getName());
    }
}
public class ThreadGroupDemo {
    public static void main() {
        ThreadGroup apiGroup=new ThreadGroup("API GROUP");
        MyThread t1=new MyThread(apiGroup,"api-Thread-1");
        MyThread t2=new MyThread(apiGroup,"api-Thread-2");
        t1.start();
        t2.start();
    }
}
