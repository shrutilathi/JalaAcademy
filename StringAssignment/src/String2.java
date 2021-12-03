

/**
 *2.Concatenating two strings using + operator
 *3.Finding the length of the string
 *4.Extract a string using Substring
 *8.startsWith(), endsWith() return true / false
 *9.Trimming strings with trim()
 * 10.Replacing characters in strings with replace()
 * 14.Converting to uppercase and lowercase

 * @author shruti
 * public String replace(char oldChar, char newChar)  
 *
public String replace(CharSequence target, CharSequence replacement)    
 */
public class String2 {
    public static void main(String[] args) {
         String s1="java is EaSy,SIMPLE and good";
    String s2=" Programming    ";
        System.out.println("String s1 : "+s1);
        System.out.println("String s2 : "+s2);
    String con=s1+s2;//concate string
        System.out.println("Concatenated string : "+con);
        System.out.println("Length of s1 : "+s1.length());
        System.out.println("Substring : "+s2.substring(0,4));
        int index1=s1.indexOf('a',2);
        int index2=s2.indexOf("gram");
        System.out.println("Index of a in s1 after index2: "+index1);
        System.out.println("Index of gram in s2 : "+index2);
        System.out.println("String s1 Starts with \'java\' : "+s1.startsWith("java"));
        System.out.println("String s1 ends with \'bad\' : "+s1.endsWith("bad"));
        System.out.println("Trimmed String s2: "+s2.trim()+"Check");
        String s1lower=s1.toLowerCase();
        System.out.println("lowercase s1 : "+s1lower);
        String s1upper=s1.toUpperCase();
        System.out.println("UPPERCASE S1 : "+s1upper);
        String rs=s1.replace("good","bad");
        System.out.println("Replaced String s1 : "+rs);
    }
   
    
}
