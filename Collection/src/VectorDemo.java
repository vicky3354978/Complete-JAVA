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
        System.out.println(vector);
    }
}
