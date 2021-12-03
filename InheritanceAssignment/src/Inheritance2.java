
/**
 *Run Time Polymorphism
 * @author shruti
 */
class X{
   void show()
   {
       System.out.println("Hello From X..");
   }
}
class Y extends X{
void show()
   {
       System.out.println("Hello From Y..");
   }
}
class Z extends Y{
    void show()
   {
       System.out.println("Hello From Z..");
   }
}
public class Inheritance2 {
    public static void main(String[] args) {
        X x1;
        Y y1=new Y();
        Z z1=new Z();
        //parent reference holds child variable then run time polymorphism
        x1=y1;
        x1.show();
        x1=z1;
        x1.show();
    }
}
