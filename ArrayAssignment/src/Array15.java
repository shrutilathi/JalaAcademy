
import java.util.Arrays;


/**
 *15.Write a method to find number of even number and odd numbers in an array

 * @author shruti
 */
public class Array15 {
    static int even;
    static int odd;
    public static void evenOdd(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Count of Even Number: "+even);
        System.out.println("Count of Odd Number: "+odd);
    }
    public static void main(String[] args) {
        int a[]={10,2,4,6,8,3,5,9,7,1,13};
        System.out.println("Array : "+Arrays.toString(a));
        evenOdd(a);
    }
}
