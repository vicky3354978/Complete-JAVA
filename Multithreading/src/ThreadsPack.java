class Practice extends Thread{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("hello"+Thread.currentThread().getName());
        }
    }

}
public class ThreadsPack
{
    static void main() {

        Practice p=new Practice();
        p.start();
    }
}
