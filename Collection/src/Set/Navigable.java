package Set;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigable {
    static void main() {
        NavigableSet<Integer> navigableSet=new TreeSet<>(Arrays.asList(1,2,31,4,5,16,10));
        int key=2;
        System.out.println(navigableSet.lower(key));
        //iska matlab ki key se choot element kya hai;
        System.out.println(navigableSet.floor(key));
        System.out.println(navigableSet.higher(4));
        System.out.println(navigableSet.ceiling(2));


      /*  lower   → <
        floor   → <=

        higher  → >
        ceiling → >=*/

        //polling----remove first and last element and last element

        System.out.println("polling first element :"+navigableSet.pollFirst());
        System.out.println("polling last element :"+navigableSet.pollLast());
        System.out.println(navigableSet);


    }

}
