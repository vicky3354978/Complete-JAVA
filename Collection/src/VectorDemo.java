import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    static void main() {
        Vector<Integer> vector =new Vector<>();
        vector.add(20);
        vector.add(50);
        vector.add(30);
        vector.add(40);
        vector.add(30);
        vector.remove(3);
        //System.out.println(vector);--->iss line main internally loop lagata hai..
        //without using this line how to print vector element ?
        //we use enumeration
        System.out.println("using enumeration ");
       Enumeration<Integer> enumeration= vector.elements();
       while(enumeration.hasMoreElements())//-->this condition check collection have element or not
       {
           Integer data=enumeration.nextElement();//--->this next element is generic type so it is write like Integer.
           System.out.println(data);
       }
        Iterator <Integer> iterator= vector.iterator();
        System.out.println("using iterator ");
       while(iterator.hasNext())
       {
           Integer data=iterator.next();
           System.out.println(data);
       }
     }
}
