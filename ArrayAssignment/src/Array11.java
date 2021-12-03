
import java.util.Arrays;
import java.util.HashSet;




/**
 *11.Write a program to find the common values between two arrays
 * @author shruti
 */
public class Array11 {
    public static void FindCommon(String[] arr1,String[] arr2)
    {
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    h.add(arr1[i]);
                    break;
                }
            }
        }
        for(String i:h)
        {
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        String[] arr1={"every","girls","love","fivestar","and","chips"};
        String[] arr2={"i","love","coke","and","chips"};
        System.out.println("Array 1 : "+Arrays.toString(arr1));
        System.out.println("Array 2 : "+Arrays.toString(arr2));
        System.out.println("Common Elements : ");
        FindCommon(arr1,arr2);
    }
}
