
import java.util.Scanner;


/**
 *9.Write a program to find the prime or not.
 * @author shruti
 */
public class Loop9 {
    public static void main(String[] args) {
        int i;
        boolean f=false;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n=sc.nextInt();
        for(i=2;i<=(n/2);i++)
        {
            if(n%i==0)
            {
                f=true;
                break;
            }
        }
        if(f)
        {
            System.out.println("Non-Prime Number");
        }
        else
        {
            System.out.println("Prime");
        }
    }
}
