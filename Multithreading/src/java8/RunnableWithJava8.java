package java8;

public class RunnableWithJava8 {
    static void main() {
        Runnable r=()->
        {
           /* Runnable is an interface
                and r is reference variable of the Runnable class
                and () it means not value pass on it.*/
            for(int i=0; i<10; i++)
            {
                System.out.println(i +" is executed by "+Thread.currentThread().getName());
            }
        };
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        t1.start();
        t2.start();
        t3.start();
    }
}
