

/**
 *7.Create an interface and inherit it from the other interface.
 * @author shruti
 */
interface int1{
    void state();
}
interface int2 extends int1{
    void city();
}
class C1 implements int2{
    public void state()
    {
        System.out.println("My state is Madhya Pradesh");
    }
    public void city()
    {
        System.out.println("I live In Indore");
    }
}
public class Interface7 {
    public static void main(String[] args) {
        C1 obj=new C1();
        obj.state();
        obj.city();
    }
}
