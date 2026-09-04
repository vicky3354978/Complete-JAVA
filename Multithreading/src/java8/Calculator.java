package java8;
@FunctionalInterface
interface cal//interface with single abstract method is call functional interface
{
    public int sum(int a,int b);
   /* default void display()
    {
        System.out.println("hello");
    }*/
    // in java 8 features we have default method it can implement inside the interface
}
public class Calculator{
    static void main() {
         cal c=( a,  b)->// it is a lamda expression
        {
            return a+b;
        };
         int result =c.sum(10,10);
        System.out.println("the sum of a and b is "+result);
    }

}

