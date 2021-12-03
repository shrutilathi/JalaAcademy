
import java.util.Scanner;


/**
 *8.Write a program to find Armstrong number or not
 * 153=1^3+5^3+3^3
 * @author shruti
 */
public class Loop8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n=sc.nextInt();
        int r,sum=0,temp;
        temp=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is Non-Armstrong");
        }
    }
}
