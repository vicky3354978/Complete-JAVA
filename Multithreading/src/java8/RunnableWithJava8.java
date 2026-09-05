package java8;

public class RunnableWithJava8 {
    static void main() {
        /*Runnable r=()->
        {

            for(int i=0; i<10; i++)
            {
                System.out.println(i +" is executed by "+Thread.currentThread().getName());
            }
        };*/
        /* Runnable is an interface
                and r is reference variable of the Runnable class
                and () it means not value pass on it.*/
        Thread t1=new Thread(()->
        {
            for(int i=0; i<10; i++)
            {
                System.out.println(i +" is executed by "+Thread.currentThread().getName());
            }
        });
     //we can enter implementation of Tread into directly on the Thread class
        t1.start();

        for(int i=0; i<10; i++)
        {
            System.out.println(i +" is executed by "+Thread.currentThread().getName());
        }
    }
}
