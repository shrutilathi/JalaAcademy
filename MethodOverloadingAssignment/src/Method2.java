

/**
 *2.Write two methods with the same name but different number of parameters of different 
data type and call the methods from main method
 * @author shruti
 */
public class Method2 {
    void show(int a)
    {
        System.out.println("Shows Integer Value "+a);
    }
    void show(int a,String s)
    {
        System.out.println("Shows String Value "+s+" Integer "+a);
    }
    public static void main(String[] args) {
        Method2 obj=new Method2();
        obj.show(10,"Shruti");
        obj.show(1000);
    }
}
