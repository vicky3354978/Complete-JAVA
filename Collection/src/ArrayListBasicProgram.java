import java.util.*;

public class ArrayListBasicProgram {
    static void main() {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);


        //if we want to write String type list so

        ArrayList<String> name=new ArrayList<>();
        name.add("vicky");
        name.add("vikas");
        name.add("vivek");
        name.add("Ravi");

        System.out.println(name);
        //if I want to add other name at 3rd index so we use
        name.add(3,"vishal");
        System.out.println(name);

        //if i want to remove element of arraylist so we use remove method

        name.remove(3);
        System.out.println(name);


        //how to convert array or String type of array into list

        String[] str={"c","s","e"};
        List<String> convertedList=new ArrayList<>(Arrays.asList(str));

        System.out.println(convertedList);
        convertedList.remove(1);
        System.out.println(convertedList);

        //how to traverse arraylist.....

        for(int i=0; i<name.size(); i++)
        {
            System.out.println(name.get(i));
        }


        //if I want to sort array list so we use collections class which final class it contain same common methods
        //there is one sorting method which is sort....


        Collections.sort(list);
        System.out.println(list);

        /*Java ki Collections.sort() method ki baat kar ra he ho.
        Modern Java mein:
        Collections.sort(list);
        internally TimSort use kar ti hai for List implementations that support the relevant sorting path.
        TimSort kya hai?
                TimSort ek hybrid sorting algorithm hai jo mainly:
        Merge Sort
        Insertion Sort
        ke ideas ko combine kar ta hai.
*/
    }
}
