import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CursorDemo {
    static void main() {
        ArrayList<String> name=new ArrayList<>(Arrays.asList("vicky","vikas","vishal"));
        System.out.println(name);//isko likhne se list ki form mai output aata hai
        //if want to do same task on this name we can't perform the
        //using cursor we perform task on our list data ...


        //but i want all name but vikas ko print name karna remove karna hai ....

        Iterator<String> it=name.iterator();
        while(it.hasNext())
        {
            String data= it.next();
            if(data.equals("vikas"))
            {
                System.out.println("found");
            }
            else
            {
                System.out.println(data);
            }
        }
    }
}
