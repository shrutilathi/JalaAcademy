
/**
 *8.Create a PUBLIC interface with fields and methods, fields should have values assigned. 
Implement this interface to some class and print the values of the interface fields and 
call the interface methods
* 9.Create a PRIVATE or PROTECTED interface and print the values as above scenario
 * @author shruti
 */
interface MyInterface{
    int num=10;
    //public static final by default
    void display();   
}
class Demo implements MyInterface{
    public void display()
    {
        System.out.println("This is the implementation of the display method");
    }
}
public class Interface8 {
    public static void main(String[] args) {
            Demo d=new Demo();
            System.out.println("The value of number of Interface : "+MyInterface.num);
            d.display();
    }

    
}
