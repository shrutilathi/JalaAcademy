
import java.util.Arrays;



/**
 *17.Write a method to verify if the array contains two specified elements(12,23)
 * @author shruti
 */
public class Array17 {
    public static boolean result(int[] arr,int num1,int num2)
    {
        boolean b = false;
        for(int i:arr)
        {
            boolean r= (i!=num1) && (i!=num2);
            if(r)
            {
                return false;
            }
          
           
                      }
return true;
  
    }
    public static void main(String[] args) {
        int a[]={10,25,48,63,12,45,96,23,65};
        System.out.println("Original Array : "+Arrays.toString(a));
        System.out.println("Result: "+result(a,12,23));
    }
}
