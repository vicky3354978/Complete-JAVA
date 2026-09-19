import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
    static void main() {
        Queue<Integer> queue=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(queue);
        //queue follows FIFO first in first out
        //that why when call the remove method the First element is removed
        queue.remove();
        System.out.println(queue);
    }
}
