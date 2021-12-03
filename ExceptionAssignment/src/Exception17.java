

/**
 *17.Write a program to generate StringIndexOutOfBoundsException
 * @author shruti
 */
public class Exception17 {
    public static void main(String[] args) {
        try{
            String s="today is cold";
            char c=s.charAt(25);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("String Index Out of Bound exception");
        }
    }
}
