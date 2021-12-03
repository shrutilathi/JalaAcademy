
import java.util.Scanner;


/**
 *2.Write a function to calculate the average value of an array of integers
 * @author shruti
 */
public class Array2 {
    public static void main(String[] args) {
        int n,sum=0;
        float avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter All the elements of an Array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum : "+sum);
        avg=(float)sum/n;
        System.out.println("Average : "+avg);
    }
}
