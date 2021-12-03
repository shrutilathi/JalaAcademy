
import java.util.Arrays;



/**
 *13.Write a method to find the second largest number in an array
 * @author shruti
 */
public class Array13 {
    public static int getSecondLargest(int[] a,int total)
    {
        int temp;
        for(int i=0;i<total;i++)
        {
            for(int j=i+1;j<total;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String[] args) {
        int a[]={10,25,45,96,87,123,459,68};
        System.out.println("Array : "+Arrays.toString(a));
        System.out.println("Second Largest number: "+getSecondLargest(a,a.length));
    }
}
