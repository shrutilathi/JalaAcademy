

/**
 *2.Print instance variables in static methods
We cannot access non-static variables or instance variables inside a static method. 
* Because a static method can be called even when no objects of the class have been instantiated.
 * @author shruti
 */
public class Static2 {
     public int k = 10;
 
    public static void main(String[] args)
    {
 
        // try to access instance variable a
        // but it's give us error
//        System.out.print("value of a is: " + k);
    }
}
