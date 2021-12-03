
/**
 *5.Write a program to throw exception with your own message
 * @author shruti
 */
public class Exception5 {
    void div(int a,int b) throws ArithmeticException
    {
        if(b==1)
        {
            throw new ArithmeticException("/ by one");
        }
        else
        {
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Exception5 ob=new Exception5();
        try{
            ob.div(10,2);
            ob.div(10,1);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
