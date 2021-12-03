
/**
 *4.Write two methods with the same name and same number of parameters of different 
type and call from main method
 * @author shruti
 */
public class Method4 {
    void display(int x,int y)
    {
        System.out.println("Integers values "+x+" "+y);
    }
    void display(String a,String b)
    {
        System.out.println("String values "+a+" "+b);
    }
    public static void main(String[] args) {
        Method4 obj=new Method4();
        obj.display(10,20);
        obj.display("Shruti","Lathi");
    }
}
