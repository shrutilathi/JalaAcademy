
import java.util.Scanner;



/**
 *3. Program to equal operator and not equal operators
4. Write a program to find the two numbers equal or not.
 * @author shruti
 */
public class Operator3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println(" Numbers are EQUAL");
        }
        if(a!=b)
        {
            System.out.println(" Numbers are NOT EQUAL");
        }
    }
}
