

import java.util.Arrays;


/**
 *16.Write a function to get the difference of largest and smallest value
 * @author shruti
 */
public class Array16 {
    public static int getDiff(int[] a,int total)
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
        int diff=(a[total-1])-(a[0]);
        return diff;
    }
    public static void main(String[] args) {
         int a[]={10,152,25,45,96,87,123,459,68,1000};
        System.out.println("Array : "+Arrays.toString(a));
        System.out.println("Difference of Largest and smallest value : "+getDiff(a,a.length));
    }
}
