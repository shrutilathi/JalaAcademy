
import java.util.Arrays;
import java.util.LinkedHashSet;



/**
 *12.Write a method to remove duplicate elements from an array
 * @author shruti
 */
public class Array12 {
    public static void removeDuplicates(int[] arr)
    {
        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
        //hashset does not contain duplicate elements
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        System.out.println("Array without duplicates:"+set);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,1,4,5,6,1,1,3,3};
        System.out.println("Original Array : "+Arrays.toString(a));
        removeDuplicates(a);
    }
}
