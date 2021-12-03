
package mypac;

/**
 *If you don't use any modifier, it is treated as default by default.
 * The default modifier is accessible only within package. 
 * It cannot be accessed from outside the package.
 * @author shruti
 */
class Default
{
     Default()
    {
        System.out.println("Default constructor");
    }
}
public class DefaultCons {
    public static void main(String[] args) {
        Default d=new Default();
    }
}
