

/**
 *5.Create two interfaces with the same method (same signature) in both the interfaces. 
Implement these two interfaces in one class. Call the method
 * @author shruti
 * If a type implements two interfaces, and each interface define a method that has identical signature, 
 * then in effect there is only one method, and they are not distinguishable.
 * If, say, the two methods have conflicting return types, then it will be a compilation error. 
 */
interface Black{
    void color();
}
interface White{
    void color();
}
class Color implements Black,White{
    public void color()
    {
        System.out.println("I print Color");
    }
}
public class Interface5 {
    public static void main(String[] args) {
        Color c1=new Color();
        c1.color();
    }
}
