
import java.util.Arrays;
import java.util.Scanner;


/**
 *8.Write a function to find the minimum and maximum value of an array
 * @author shruti
 */
public class Array8 {
    public static int findMax(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
     public static int findMin(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        
       int[] arr={10,20,45,78,65,14,85,23,41,95,102};
        System.out.println("Array is : "+Arrays.toString(arr));
        int max=findMax(arr);
        int min=findMin(arr);
        System.out.println("Maximum Value : "+max+" and Minimum Value : "+min);
    }
  
          
}
