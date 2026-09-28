package Set;

import java.util.LinkedHashSet;

public class LInkedHashSet {
    static void main() {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        //in this structure order is preserved because ja list.add karte hai toh ak node create hoti hai or
        // fir hum dubara node create karte hai jiss woh pichli node connect hoti hai is liye ye order preserve
        //karta hai
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);//duplicates are not allowed
        System.out.println(set);
    }
}
