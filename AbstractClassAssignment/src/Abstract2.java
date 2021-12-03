
/**
 *2.Create a sub class for an abstract class. Create an object in the child class for the 
abstract class and access the non-abstract methods
 * @author shruti
 */
abstract class Parent{
    void display()
    {
        System.out.println("Non-Abstract Method");
    }
}

public class Abstract2 extends Parent {
    public static void main(String[] args) {
        Parent obj=new Abstract2();
        obj.display();
    }
}
