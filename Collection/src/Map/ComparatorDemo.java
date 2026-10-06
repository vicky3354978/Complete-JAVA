package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Employee implements Comparator<Employee>
{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id-o2.id;
    }

}
class MyComparator implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id-o2.id;
    }
}

public class ComparatorDemo {
    static void main() {
        Map<Employee,String> map=new TreeMap<>(new MyComparator());
        map.put(new Employee(1,"vicky",10000),"Dev");
        map.put(new Employee(0,"vikas",10000),"Devops");
        map.put(new Employee(4,"vishal",10000),"security");
        map.put(new Employee(9,"vivek",10000),"it");
       // return o1.id-o2.id; ------->ye likhne se id ke according sorting ho rahi hai..
        System.out.println(map);

    }
}
