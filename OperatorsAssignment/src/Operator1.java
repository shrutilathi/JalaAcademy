
import java.util.Scanner;



/**
 *1.Write a function for arithmetic operators(+,-,*,/)
 * @author shruti
 */
public class Operator1 {
    public static double add(double a,double b)
    {
        return a+b;
    }
    public static double minus(double a,double b)
    {
        return a-b;
    }
    public static double multiply(double a,double b)
    {
        return a*b;
    }
    public static double divide(double a,double b)
    {
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two numbers : ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("sum : "+add(a,b));
        System.out.println("difference : "+minus(a,b));
        System.out.println("product : "+multiply(a,b));
        System.out.println("divide : "+divide(a,b));
    }
}
