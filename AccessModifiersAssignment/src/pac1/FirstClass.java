package pac1;


/**
 *3.. Create a class with PROTECTED fields and methods. Access these fields and methods 
from any other class in the same package.
 * @author shruti
 */
public class FirstClass {

    protected String name;

    protected FirstClass(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}

