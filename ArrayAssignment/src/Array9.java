
import java.util.Arrays;


/**
 *9.Write a function to reverse an array of integer values
 * @author shruti
 */
public class Array9 {
    public static int[] reverseArray(int arr[])
    {
        int temp[]=new int[arr.length];
        for(int i=0,j=arr.length;i<arr.length;i++)
        {
            temp[i]=arr[j-1];
            j--;
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        System.out.println("Original Array : "+Arrays.toString(a));
        int revarr[]=reverseArray(a);
        System.out.println("Reversed Array : "+Arrays.toString(revarr));
    }
}
