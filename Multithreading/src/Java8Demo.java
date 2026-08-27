public class Java8Demo {
    static void main() {
        Runnable task =()->{
            for(int i=0;i<10; i++)
            {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

    }


}
