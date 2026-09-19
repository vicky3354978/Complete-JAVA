import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    static void main() {
        Queue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
        queue.add(100);
        queue.add(700);
        queue.add(30);
        queue.add(40);
        queue.add(500);
        System.out.println(queue);

        System.out.println(queue.poll());
        //in queue by default deletion priority is lower no----->highest priority
        //Queue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
        //after adding this line then highest no ----> will highest priority
    }
}
