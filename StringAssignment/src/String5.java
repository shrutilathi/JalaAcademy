
import java.util.Scanner;


/**
 *5.Searching in strings using indexOf()
 * @author shruti
 * 11.Splitting strings with split()
 */
public class String5 {
    public static void main(String[] args) {
        String str="Welcome to my assignment..this assignment is of java";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string that you want to search");
        String search=sc.nextLine();
        int index=str.indexOf(search);
        if(index==-1)
        {
            System.out.println("String not found");
        }
        else
            System.out.println("String Founded ");
        
    }
}
