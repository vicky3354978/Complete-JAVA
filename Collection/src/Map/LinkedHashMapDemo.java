package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo{
    static void main() {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"A");
        map.put(2,"b");
        map.put(10,"f");
        map.put(4,"c");
        map.put(5,"b");
        map.put(null,"b");

        // it contain duplicate value but unique key
        //if i want to again use same key which is present in map
        // it will be over write.
        map.put(1,"N");
        //in position of 1 value is A which is over write by N
        // output is : {1=N, 2=b, 10=f, 4=c, 5=b}
        System.out.println(map);


    }
}
