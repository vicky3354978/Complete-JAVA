import java.util.ArrayList;
import java.util.List;

public class CloneArrayLIst {
    static void main() {
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(20);
        System.out.println(list);
        ArrayList arraylist=new ArrayList();
        arraylist.add(10);
        Object clone;
        clone = arraylist.clone();
        System.out.println(arraylist.clone());
        //clone() same ArrayList ko return nahi karta.
        //Ye ek naya ArrayList object banata hai aur original ke elements ko usme copy karta hai.
       // Ab clone variable new ArrayList object ko refer kar raha hai:

    }
}
