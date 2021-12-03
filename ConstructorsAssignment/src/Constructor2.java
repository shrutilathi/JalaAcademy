
/**
 *2.Call the constructors(both default and argument constructors) of super class from a child 
class
 * @author shruti
 */
class A{
    A()
    {
        System.out.println("Default Constructor of Parent class");
    }
    A(int x,int y)
    {
        System.out.println("Hello from A "+x+" "+y);
    }
}
class B extends A{
    
    B(int a,int b,int c)
    {
        super(a,b);
        A a1=new A();
        System.out.println("Hello from B "+a+" "+b+" "+c);
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        B b1=new B(10,20,30);
    }
}
