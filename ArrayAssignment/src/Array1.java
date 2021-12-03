
import java.util.Arrays;
import java.util.Scanner;


/**
 *1.Write a function to add integer values of an array
 * @author shruti
 */
public class Array1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int newArr[]=new int[n+1];
        System.out.println("Array : " +Arrays.toString(arr));
        System.out.println("Enter Any integer Value you want to add : ");
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
       
        for(int i=0;i<n;i++)
        {
            newArr[i]=arr[i];
        }
        newArr[n]=value;
        System.out.println("Array after adding integer value : "+Arrays.toString(newArr));
    }
}
