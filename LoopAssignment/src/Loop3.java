
import java.util.Scanner;


/**
 *3.Program to equal operator and not equal operators

 * @author shruti
 */
public class Loop3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Two Number for Equality Check : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1==n2)
        {
            System.out.println("The two Numbers are equal");
        }
        else
        {
            System.out.println("The two numbers are not equal");
        }
    }
}
