package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    static void main() {
        Set<Integer> set=new HashSet<>(Arrays.asList(9,1,2,3,4,56,2,0,100));
        //note there is no order preserved and duplicate not allowed...
        set.add(null);
        set.add(null);
        //null bhi duplicate hai iss li ye ak bar aaya
        System.out.println(set);
    }
}
