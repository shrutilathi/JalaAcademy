
import java.util.Scanner;



/**
 *11.Program to check whether a number is EVEN or ODD using switch
 * @author shruti
 */
public class Loop11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int a=sc.nextInt();
        int n=a%2;
        switch(n)
        {
            case 0:System.out.println("Number is Even");
            break;
            default:System.out.println("Number is Odd");
        }
            
    }
}
