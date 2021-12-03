
/**
 *1. Write two methods with the same name but different number of parameters of same type 
and call the methods from main method

 * @author shruti
 */
public class Method1 {
    void add()
    {
        System.out.println("Default");
    }
    void add(int x,int y)
    {
        System.out.println(x+y);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Method1 obj=new Method1();
        obj.add();
        obj.add(10,20);
        obj.add(100,200,300);
    }
}
