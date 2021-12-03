
/**
 *2.Create a class with DEFAULT fields and methods. Access these fields and methods 
from any other class in the same package
 * @author shruti
 */
class Shruti{
    int a=19;
    void print()
    {
        System.out.println("My Name is Shruti and my age is "+a);
    }
}
public class AM2 {
    public static void main(String[] args) {
        Shruti s=new Shruti();
        s.print();
        
    }
}
