

/**
 *4. Write a program with multiple catch blocks
 * @author shruti
 */
public class Exception4 {
    public static void main(String[] args) {
        int a=10,b=0,c,d[]={1,2,3};
        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Don't divide by Zero");
        }
        try
        {
            System.out.println(d[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index of array");
        }
        System.out.println("Bye");
    }
}
