package ThreadGroupInJava;

class OurThread extends Thread
{
    public OurThread(ThreadGroup apiGroup,String name)
    {
        super(apiGroup,name);
    }

    @Override
    public void run() {
        System.out.println("this is run by :"+Thread.currentThread().getThreadGroup().getName()
                +" "+Thread.currentThread().getName());
    }
}

public class practice {
    static void main() {
        ThreadGroup ApiGroup=new ThreadGroup("Api-group");
        OurThread t1=new OurThread(ApiGroup,"api-1");
        OurThread t2=new OurThread(ApiGroup,"api-2");
        t1.start();;
        t2.start();
    }


}
