package Map;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
    static void main() {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Iterator<Integer> iterator= list.iterator();
        while(iterator.hasNext())
        {
            Integer next= iterator.next();
            System.out.println(next);
            //list.add(90);//this line occurred error this is fail fast error...
           /* Exception in thread "main" java.util.ConcurrentModificationException
            at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
            at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
            at Map.FailFast.main(FailFast.java:16)*/
        }
    }

}
