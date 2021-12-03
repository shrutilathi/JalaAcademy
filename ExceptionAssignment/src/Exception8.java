

/**
 *8.Write a program to generate Arithmetic Exception
 * @author shruti
 */
public class Exception8 {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            int c=a/b;
            System.out.println("Result : "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
