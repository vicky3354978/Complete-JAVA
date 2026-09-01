package Prevantion;

class Washing extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("washing staring");
            Thread.sleep(3000);
            System.out.println("washing is finished ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadJoin {
    static void main() throws InterruptedException {
        Washing wash=new Washing();
        wash.start();
        // wash.join(1000,100);
        //it waits only 10000ms and 100nano sec.
        //wash.join(1000);
        // -->it wait only 1000ms after this time it will run
        wash.join();//this join waits until run() method is done.
        //if I want to execute my run method first so we write wash.join() after write this code
        //drying cloths will not execute first ,firstly start the run method of Thread........
        System.out.println("drying cloths ");
    }
}
