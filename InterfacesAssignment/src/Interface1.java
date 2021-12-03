

/**
 *1.Create an interface with only one method and implement it in a class. Call the method 
implemented.
 * @author shruti
 */
interface First
{
    void show();
            
}
class A implements First{
    public void show()
    {
        System.out.println("Hello From A");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        A a1=new A();
        a1.show();
    }
}
