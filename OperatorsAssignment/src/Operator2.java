
/**
 *2.Write a method for increment and decrement operators(++, --)
 * @author shruti
 */
public class Operator2 {
    public static int increment(int n)
    {
        return ++n;
    }
    public static int decrement(int n)
    {
        return --n;
    }
    public static void main(String[] args) {
        int x=11;
        int y=68;
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        int a=increment(x);
        System.out.println("++X = "+a);
        int b=decrement(y);
        System.out.println("--Y = "+b);
    }
}
