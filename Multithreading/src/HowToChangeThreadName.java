class MThread implements Runnable
{
    @Override
    public void run() {
        System.out.println("hello"+Thread.currentThread().getName());
    }
}
public class HowToChangeThreadName {
    static void main() {
        Thread t=new Thread(new MThread());
        System.out.println("current executing Thread is :"+Thread.currentThread().getName());
        String name=t.getName();
        System.out.println("created Thread name is :"+name);
        t.setName("myThread-0");
        String updatedName=t.getName();
        System.out.println("updated name is :"+updatedName);
    }
}
