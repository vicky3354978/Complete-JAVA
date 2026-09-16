import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromArrayList {
    static void main() {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,1,22,33,33,344,1,1,12,1,12,44));


        ArrayList<Integer> unique=new ArrayList<>();

        //syntax of foreach loop
        /*for(Wrapper class variable: list name)
        {

        }*/
        for(Integer data:a)
        {
            if(!unique.contains(data))
            {
                unique.add(data);
            }
        }
        System.out.println(unique);
    }
}
