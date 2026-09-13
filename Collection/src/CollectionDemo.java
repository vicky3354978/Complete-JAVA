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
       /* in array;*/
        int arr[]={1,2,3,4,5};
        System.out.println(arr[3]);
        //if i want to choose particular element of array we use index number
        //but in arraylist we use list.get(3);

        System.out.println(list.get(3));


    }

}
