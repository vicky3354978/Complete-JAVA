package Set;

import java.util.TreeSet;

 class Student implements Comparable<Student>
{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(this.id-o.id);
        return this.id-o.id;
    }
}
public class TreeSet1 {
    static void main() {
        TreeSet<Student> treeSet=new TreeSet<>();
        Student s1=new Student(1,"vicky");
        Student s2=new Student(2,"vikas");
        treeSet.add(s1);
        treeSet.add(s2);
        System.out.println(treeSet);
    }
}
