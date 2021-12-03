

/**
 *5.Call constructor of the parent class using super()
 * @author shruti
 */
class A
{
    A(int x,int y)
    {
        System.out.println("Hello from A "+x+" "+y);
    }
}
class B extends A{
    B(int a,int b,int c)
    {
        super(a,b);
        System.out.println("Hello From B "+a+" "+b+" "+c);
    }
}
        
public class This5 {
    public static void main(String[] args) {
        A a1=new A(10,20);
        B b1=new B(100,200,300);
    }
}
