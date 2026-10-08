package Map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedMap {
    static void main() {
        HashMap<Integer,String> map=new HashMap<>();
        //in hash map contain null key value and null key value both.
        // because it is not Thread safe.

        map.put(1,"a");
        map.put(null,"vicky");
        map.put(3,null);
        System.out.println(map);
        //these are valid terms ..

        ConcurrentHashMap<Integer,String> concurrentHashMap=new ConcurrentHashMap<>();
      /*  concurrentHashMap.put(null,"vicky");
        concurrentHashMap.put(2,null);*/
        //these are invalid terms because concurrentHashmap does not contain null value and null key value..
    }
}
