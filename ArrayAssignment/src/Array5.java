
import java.util.Arrays;
import java.util.Scanner;


/**
 *5.Write a function to remove a specific element from an array
 * @author shruti
 */
public class Array5 {
    public static int findIndex(int arr[],int t)
    {
      if(arr==null)
          return -1;
      int len=arr.length;
      int i=0;
      while(i<len)
      {
          if(arr[i]==t)
              return i;
          else i++;
      }
      return -1;
    }
    public static int[] removeTheElement(int[] arr,int index)
    {
        if(index==-1)
        {
            return arr;
        }
        int[] anotherArray=new int[arr.length-1];
        for(int i=0,k=0;i<arr.length;i++)
        {
            if(i==index)
            {
                continue;
            }
            anotherArray[k++]=arr[i];
        }
        return anotherArray;
    }
    public static void main(String[] args) {
        int my_arr[]={10,20,30,40,50,60};
        System.out.println("Original array : "+Arrays.toString(my_arr));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The element you want to remove : ");
        int a=sc.nextInt();
        int index=findIndex(my_arr,a);
        my_arr=removeTheElement(my_arr,index);
        System.out.println("Resultant Array : "+Arrays.toString(my_arr));
    }
}
