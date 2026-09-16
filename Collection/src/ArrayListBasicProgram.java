import java.util.ArrayList;

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
    }
}
