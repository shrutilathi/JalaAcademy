
package pac2;
import pac1.*;
/**
 *
 * @author shruti
 * 3.Also, Access the PROTECTED fields and methods from child class located in a different 
package
 */
public class SecondClass extends FirstClass {
    public static void main(String[] args) {
        SecondClass s=new SecondClass("Inheritance");
    }
    public SecondClass(String name) {
        super(name);
        System.out.println("SecondClass name is " + this.getName());

    } 
   
}
