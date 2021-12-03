package pac1;

/**
 * 4.Accessing with public class in same package
 *
 * @author shruti
 */
public class PublicClassY {

    public static void main(String args[]) {
        System.out.println("Same Package...");
        PublicClassX obj = new PublicClassX();
        System.out.println("sum " + obj.addTwoNumbers(100, 1));
    }
}
