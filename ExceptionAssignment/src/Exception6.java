

/**
 *6.Write a program to create your own exception
 * @author shruti
 */
class TestException extends Exception
{
    String msg;
    TestException(String str)
    {
        msg=str;
    }
    public String toString()
    {
        return("TestException : "+msg);
    }
}
public class Exception6 {
    public static void main(String[] args) {
        int a=10,b=1,c;
        try
        {
            if(b==1)
            {
                throw new TestException("/ by one ");
            }
            else
            {
                c=a/b;
                System.out.println(c);
            }
        }
        catch(TestException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Byeeeee");
    }
    
}
