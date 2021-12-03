
import java.util.Scanner;



/**
 *4.Write a program to print the odd and even numbers.
 * @author shruti
 */
public class Loop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
