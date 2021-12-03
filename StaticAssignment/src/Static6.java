
/**
 *6.Print all the static, instance variables in main method
 * 7.Call static methods and instance methods in main metho
 *
 * @author shruti
 */
public class Static6 {
    int x=100;
    static int a = 10;
    //instance method need object

    void display() {
        System.out.println("This is an instance method");
      
    }

    static void show() {
        System.out.println("This is a Static method");

    }

    public static void main(String[] args) {
        Static6 obj = new Static6();
        System.out.println("Instance Variable "+obj.x);
        obj.display();//instance method
        System.out.println("Static Variable "+a);//Static6.a
        Static6.show();
        
    }
}
