package Map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    static void main() {
        Map<Integer,Integer> map=new HashMap<>();
        int arr[]={1,2,3,1,1,2,3,4,5,4,4};
        for(int n: arr)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println(map);
    }
}
