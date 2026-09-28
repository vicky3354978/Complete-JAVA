package Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortSet {
    static void main() {
        SortedSet<Integer> sortedset = new TreeSet<>();
        sortedset.add(10);
        sortedset.add(1);
        sortedset.add(100);
        sortedset.add(210);
        sortedset.add(130);
        System.out.println(sortedset);
        // is do not contain any duplicate and sort data at ascending  order
        System.out.println(sortedset.first());
        //.first give you first element
        //headset()-->all element less than head;
        System.out.println(sortedset.headSet(130));
        //tailset()-->all element greater than tail;
        System.out.println(sortedset.tailSet(100));

    }
}
