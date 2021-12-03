
import java.util.Arrays;



/**
 *6.Write a function to copy an array to another array
 * @author shruti
 */
public class Array6 {
    public static int[] copyArray(int arr[])
    {
        if(arr==null)
        {
            System.out.println("Empty Array");
        }
        int[] anotherArray=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            anotherArray[i]=arr[i];
            
        }
        return anotherArray;
    }
    public static void main(String[] args) {
        int arr[]={10,25,46,85,12,142,45,14};
        System.out.println("Original Array : "+Arrays.toString(arr));
       int cpyArray[]=copyArray(arr);
        System.out.println("Copied Array : "+Arrays.toString(cpyArray));
        
    }
}
