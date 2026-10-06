package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    static void main() {
        Map<Integer,String> emp=new HashMap<>();
        emp.put(101,"vicky");
        emp.put(102,"vikas");
        System.out.println();

        emp.put(102,"vivek");
        emp.put(null,"vishal");
        //overwrite the value of vishal to vineet 
        emp.put(null,"vineet");
        //in this case key is unique but data is over write
        //phele 102 value pe vikas tha but ab vikas ke upper overwrite ho jaye ga or vivek aa jaye ga.

        //what is the time complexity of insertion in hashmap

        System.out.println("contains method ");
        if(emp.containsKey(101))
        {
            System.out.println("yes");
        }
        else {
            System.out.println("NO");
        }
        System.out.println("getOrDefault method ");

        String orDefault=emp.getOrDefault(101,"no");
        System.out.println(orDefault);
        //this is important method because it frequently used in DSA
        //ye key value ka data agar map mai present hai toh woh data de dega
        // agar na hi hai toh default value de dega ....

        //how to print hashmap
        for(Map.Entry<Integer,String> entry: emp.entrySet())
        {
            System.out.println(entry.getKey()+" ---> "+entry.getValue());
        }

    }
}
