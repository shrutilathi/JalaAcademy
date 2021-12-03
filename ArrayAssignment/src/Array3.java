
import java.util.Scanner;


/**
 *3.Write a program to find the index of an array element
 * @author shruti
 */
public class Array3 {
    public static void main(String[] args) {
        int a[]={50,60,40,20,45,18,46,85};
        Scanner sc=new Scanner(System.in);
        System.out.println("Find the index of : ");
        int n=sc.nextInt();
        boolean f=false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                f=true;
                System.out.println("Index of "+n+" is "+i);
                break;
            }
           
        }
        if(!f)
        {
             System.out.println("Element not found in the Array");
        }
       
       
        
     
    }
}
