

/**
 *5.Define the local and Global variables with the same name and print both variables and 
understand the scope of the variables
 * @author shruti
 */
public class Java5 {
    public static int var=18;
    public static void main(String[] args) {
        int var=20;
        System.out.println("Local variable : "+var);
        System.out.println("Static variable : "+Java5.var);
    }
}
