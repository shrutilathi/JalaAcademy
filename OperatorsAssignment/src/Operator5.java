

/**
 *5.Programs on Logical AND,OR operator and Logical NOT
 * @author shruti
 */
public class Operator5 {
    public static void main(String[] args) {
        int a=10,b=10,c=10,d=5;
        boolean x;
        x= a==b && b==c;
        System.out.println(a+" "+b+" "+c+" "+x);
        if (a == b || c > d)
            System.out.println("One or both"
                               + " the conditions are true");
         System.out.println("(c!=d) " + (c!=d));
    }
}
