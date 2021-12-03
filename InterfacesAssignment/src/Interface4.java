
/**
 *4.Create two interfaces with one method each. Implement these two interfaces in one 
class.
 * @author shruti
 */
interface One
{
    void show();
}
interface Two
{
    void display();
}
class Book implements One,Two
{
    public void show()
    {
        System.out.println("Hello from Interface One");
    }
    public void display()
    {
        System.out.println("Hello from Interface Two");
    }
}
public class Interface4 {
    public static void main(String[] args) {
       Book bb=new Book();
    bb.show();
    bb.display();  
    }
   
}
