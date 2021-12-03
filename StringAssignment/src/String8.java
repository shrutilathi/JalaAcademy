
import java.util.Scanner;


/**
 *8.equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
 *  @author shruti
 * //starsWith(),endsWith in String2.java
 * //compareTo gives 0 if the strings are same 
 * otherwise gives the difference of Ascii code of first different letter
 
 */
public class String8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String : ");
        String str1=sc.nextLine();
        System.out.println("Enter Second String : ");
        String str2=sc.nextLine();
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println(" equalsIgnoreCase : Strings are same");
        }
        else
            System.out.println(" equalsIgnoreCase : Strings are different");
        int x=str1.compareTo(str2);
        System.out.println("(0 for equal strings) : "+x);
    }
    
}
