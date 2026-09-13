import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    static void main() {
       /* list is a interface and arraylist extends this class we are created arraylist object list. */
       /* list contain duplicates and ordered indexing */
        List<Integer> list=new ArrayList<>();
       /* arraylist contain many method such as add method */
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(10);
        System.out.println(list);

    }

}
