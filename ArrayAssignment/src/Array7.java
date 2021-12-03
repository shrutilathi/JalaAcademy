
import java.util.Arrays;
import java.util.Scanner;


/**
 *7.Write a function to insert an element at a specific position in the array
 * @author shruti
 */
public class Array7 {
    public static int[] insertX(int n,int arr[],int x,int pos)
    {
        
        int i;
        int[] newArray=new int[n+1];
       
        for(i=0;i<newArray.length;i++)
        {
            if(i<pos-1)
                newArray[i]=arr[i];
            else if(i==pos-1)
            
                newArray[i]=x;
            
            else
            
                newArray[i]=arr[i-1];
            
      
        
        }
        return newArray;
    }
    
        
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        System.out.println("Array : "+Arrays.toString(a));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element you want to insert : ");
        int x=sc.nextInt();
        System.out.println("Enter the position : ");
        int pos=sc.nextInt();
        int n=a.length;
        int arrIn[]=insertX(n,a,x,pos);
        System.out.println("Array after Insertion : "+Arrays.toString(arrIn));
    }
}
