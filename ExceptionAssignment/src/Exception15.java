

/**
 *15.Write a program to generate NullPointerException
 * @author shruti
 */
public class Exception15 {
    public static void main(String[] args) {
        try{
            String a=null;
            System.out.println(a.charAt(0));
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Pointer Exception..");
        }
    }
}
