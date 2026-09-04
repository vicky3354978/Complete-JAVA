package InterCommunicationOfThread;
class WeddingHall
{
    boolean dinnerReady=false;
}
class Guest extends Thread{
    WeddingHall hall;
    Guest(WeddingHall h)
    {
        this.hall=h;
    }

    @Override
    public void run() {
        synchronized (hall)
        {
            System.out.println("guest entered in hall ");
            while(!hall.dinnerReady)
            {
                System.out.println("dinner is not ready please wait ");
                try {
                    hall.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("guest having a dinner ");
        }
    }
}
class Chef extends Thread
{
    WeddingHall hall;
    Chef(WeddingHall h)
    {
        hall=h;
    }

    @Override
    public void run() {
        synchronized(hall)
        {
            System.out.println("chef making a food :");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hall.dinnerReady=true;
            System.out.println("dinner is ready :");
            hall.notify();
        }
    }



}
public class CommDemo {
    static void main() {
        WeddingHall hall =new WeddingHall();
        Guest g=new Guest(hall);
        Chef c =new Chef(hall);
        g.start();
        c.start();
    }



}
