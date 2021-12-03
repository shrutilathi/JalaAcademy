
/**
 *3.Call constructor of the current class using this()
 * @author shruti
 */
public class This3 {
 
    int a;
    int b;
 
    //Default constructor
    This3()
    { 
        this(10, 20);
        System.out.println("Inside  default constructor \n");
    }
     
    //Parameterized constructor
    This3(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
 
    public static void main(String[] args)
    {
 
        This3 object = new This3();
        
    }
}

