

/**
 *11. Create an interface with static final variable
 * @author shruti
 */
interface In1{
    public static final int a=100;
}
public class Interface11 implements In1{
    public static void main(String[] args) {
        System.out.println("Interface Variable : "+In1.a);
    }
}
