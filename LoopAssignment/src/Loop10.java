
import java.util.Scanner;



/**
 *10.Write a program to palindrome or not
 * 151
 * @author shruti
 */
public class Loop10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n=sc.nextInt();
        int r,sum=0,temp;
        temp=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is Not a Palindrome");
    }
}
