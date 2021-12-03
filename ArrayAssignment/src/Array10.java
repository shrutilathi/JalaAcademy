
import java.util.Arrays;


/**
 *10. Write a function to find the duplicate values of an array
 * @author shruti
 */
public class Array10 {
    public static void duplicateArray(int arr[])
    {
        System.out.println("Duplicate Elements in given Array : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                System.out.println(arr[j]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,14,56,84,10,25,46,1,2,3,7,2};
        System.out.println("Array: "+Arrays.toString(arr));
        duplicateArray(arr);
    }
}
