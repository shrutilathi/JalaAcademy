

/**
 *5.Try to call the constructor multiple times with the same object
 * @author shruti
 */
public class Constructor5
{

    Constructor5(int i)
    {
        System.out.println(i);
    }

    public static void main(String args[])
    {
        
        int x = 10;
        while( x > 0)
        {
            Constructor5 obj = new Constructor5(x);
            x--;
        }
    }
}

