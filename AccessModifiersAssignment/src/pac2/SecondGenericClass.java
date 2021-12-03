
package pac2;
import pac1.*;
/**
 *3.Access the PROTECTED fields and methods from any class in different package
 * @author shruti
 * COMPILATION ERROR
 * This is because SecondGenericClass is not in the same package as FirstClass and does not subclass it.
 */
public class SecondGenericClass {
    public static void main(String[] args) {
//        FirstClass first = new FirstClass("random name");
//        System.out.println("FirstClass name is "+ first.getName());
//        first.name = "new name";
    }
}
