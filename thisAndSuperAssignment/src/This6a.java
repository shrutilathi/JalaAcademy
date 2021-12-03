

/**
 *6.Use this()  in methods not in constructor
 * @author shruti
 */
public class This6a {
   int a;
    int b;
     
    // Default constructor
    This6a()
    {
        a = 10;
        b = 20;
    }
     
    // Method that receives 'this' keyword as parameter
    void display(This6a obj)
    {
        System.out.println("a = " +obj.a + "  b = " + obj.b);
    }
  
    // Method that returns current class instance
    void get()
    {
        display(this);
    }
 
    public static void main(String[] args)
    {
        This6a object = new This6a();
        object.get();
    } 
}
