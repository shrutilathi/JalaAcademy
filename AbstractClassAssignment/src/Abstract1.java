

/**
 *1.Create an abstract class with abstract and non-abstract methods
 * @author shruti
 */
abstract class A{
    abstract void show();
    void display()
    {
        System.out.println("Hello From Class A non abstract method");
    }
}
class B extends A{
    void show()
    {
        System.out.println("Hello from Class B abstract method");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        B b1=new B();
        b1.show();
        b1.display();
    }
}
