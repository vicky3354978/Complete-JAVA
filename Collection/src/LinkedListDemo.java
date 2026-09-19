import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    static void main() {
        LinkedList<Integer> ll=new LinkedList<>(Arrays.asList(1,2,3,4,56,1));
        System.out.println(ll);
        //we can add node between using
        System.out.println("After adding 15 at 3rd position");
                ll.add(3,15);
        System.out.println(ll);

       // we can add list at first position and also last position
        System.out.println("after add 12 at last and 90 in first node ");
        ll.addLast(12);
        ll.addFirst(90);
        System.out.println(ll);
        System.out.println(ll.get(3));
    }
}
