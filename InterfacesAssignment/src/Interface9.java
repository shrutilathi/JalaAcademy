
/**
 *10.Create an interface with private, public and protected fields
 * @author shruti
 * if the members of the interface are private you cannot provide implementation to the methods or,
 * cannot access the fields of it in the implementing class.
Therefore, the members of an interface cannot be private. 
* If you try to declare the members of an interface private,
* a compile time error is generated saying “modifier private not allowed here”.
* 
* In general, the protected members can be accessed in the same class or, 
* the class inheriting it. But, we do not inherit an interface we will implement it.

Therefore, the members of an interface cannot be protected. 
* If you try to declare the members of an interface protected,
* a compile time error is generated saying “modifier protected not allowed here”.
 */
interface Test
{
    public int a=10;
//    private int b=200;
//    protected int c=152;
}
public class Interface9 implements Test{
    public static void main(String[] args) {
        System.out.println("Public Field : " + Test.a);
    }
}
