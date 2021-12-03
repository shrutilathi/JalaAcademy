
import java.util.Scanner;


/**
 *12.Print gender (Male/Female) program according to given M/F using switch
 * @author shruti
 */
public class Loop12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter gender (M/m or F/f): ");
        String s=sc.next();
        //string to char
        char c=s.charAt(0);
        switch(c)
        {
            case 'm':
            case 'M':System.out.println("Gender is Male");break;
            case 'f':
            case 'F':System.out.println("Gender is Female");break;
            default:System.out.println("Please enter specified character(M/m or F/f)");
            
        }
    }
}
