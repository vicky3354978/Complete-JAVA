import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CursorDemo {
    static void main() {
        ArrayList<String> name=new ArrayList<>(Arrays.asList("vicky","vikas","vishal"));
        System.out.println(name);

        //but i want all name but vikas ko print name karna remove karna hai ....

        Iterator<String> iterator=name.elements();
    }
}
