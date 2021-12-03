
import java.util.Scanner;


/**
 *Write a program to print largest number among three numbers
 * @author shruti
 */
public class Loop5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers  : ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float l=0f;
        if(a>b && a>c)
        {
            l=a;
        }
        if(b>a && b>c)
        {
            l=b;
        }
        if(c>a && c>b)
        {
            l=c;
        }
        System.out.println("Largest Number Among the three is "+l);
    }
}
