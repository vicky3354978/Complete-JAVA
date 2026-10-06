package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    static void main() {
        Map<Integer,String> map=new TreeMap<>();
        map.put(1,"x");
        map.put(3,"e");
        map.put(4,"r");
        map.put(9,"t");
        map.put(8,"b");
        System.out.println(map);
        map.put(null,"n");
        System.out.println(map);
        //we can not store null as a key value

    }
}
