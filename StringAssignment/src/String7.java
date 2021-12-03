
import java.util.Scanner;



/**
 *7.Comparing strings using the methods equals(),
 * @author shruti
 */
public class String7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String : ");
        String str1=sc.nextLine();
        System.out.println("Enter Second String : ");
        String str2=sc.nextLine();
        if(str1.equals(str2))
            System.out.println("Strings are Same");
        else
            System.out.println("Strings are different");
    }
  
}
