import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
    static void main() {
        Queue<Integer> queue=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(queue);
    }
}
