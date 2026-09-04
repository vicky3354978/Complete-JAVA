package java8;

interface Name
{
    void print(String name);
}
public class PrintName {
    static void main() {
        System.out.println("welcome to java 8 ");
        Name m=(name)->
        {
            System.out.println(name);
        };
        m.print("vicky");
    }
}
