

/**
 *13.Program for multiple if else statement(Largest number in 10,20 and 30)
 * @author shruti
 */
public class Loop13 {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z=30;
        if(x>=y)
        {
            if(x>=z)
            {
                System.out.println("The largest number is : "+x);
            }
            else
                System.out.println("The largest number is "+z);
        }
        else
        {
            if(y>=z)
                System.out.println("The largest number is "+y);
            else
                System.out.println("The largest number is "+z);
        }
        
    }
}
