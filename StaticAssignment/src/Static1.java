/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shruti
 */
public class Static1 {
    static int a=10;
    static int b=40;
    double x=500.12;
    double y=526.56;
    static void show()
    {
       
        System.out.println("values of a and b : "+a+" "+b);
    }
    static int add()
    {
        int c=a+b;
        return c;
    }
    public void showinstance()
    {
        System.out.println("values of x and y is "+x+" "+y);
    }
    public double diff()
    {
        double z=y-x;
        return z;
    }
    public static void main(String[] args) {
        Static1 obj1=new Static1();
        System.out.println("Instance Variabes and methods");
        obj1.showinstance();
        System.out.println("Difference of Instance Variables : "+obj1.diff());
        System.out.println("Static Variables and methods");
        Static1.show();
        System.out.println("Sum of Static variables : "+add());
    }
}
