
/**
 *
 * @author shruti
 */
class A{
  void method1A(){
      System.out.println("First Method of A");
}  
  void method2A(){
      System.out.println("Second Method of A");
  }
  void show()
  {
      System.out.println("Hello from A");
  }
}
class B extends A{
    void method1B()
    {
        System.out.println("First Method of B"); 
    }
    void method2B(){
        System.out.println("Second Method of B");
    }
    void show()
    {
        System.out.println("Hello from B");
    }
            
}
class C extends B{
    void method1C()
    {
        System.out.println("First Method of C");
    }
    void method2C()
    {
        System.out.println("Second Method of C");
    }
    void show()
    {
        System.out.println("Hello from C");
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        A a1=new A();
        a1.show();
        a1.method1A();
        a1.method2A();
        B b1=new B();
        b1.show();
        b1.method1B();
        b1.method2B();
        C c1=new C();
        c1.show();
        c1.method1C();
        c1.method2C();
        System.out.println("----------------------------");
        System.out.println("Calling overridden methods");
        System.out.println("With B class Object : ");
        b1.method1A();
        b1.method2A();
        System.out.println("With C class Object : ");
        c1.method1A();
        c1.method2A();
        c1.method1B();
        c1.method2B();
    }
}
