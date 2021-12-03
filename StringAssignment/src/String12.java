

/**
 *11.Converting Numbers to Strings with valueOf()
 * 13.Converting integer objects to Strings
 * The java string valueOf() method converts different types of values into string
 * @author shruti
 */
public class String12 {
    public static void main(String[] args) {
        boolean f=false;
        int value=10;
        String s1=String.valueOf(value);
        System.out.println(value+30);//40 because + is binary plus operator  
        System.out.println(s1+30);//concatenating string with 30
    }
}
