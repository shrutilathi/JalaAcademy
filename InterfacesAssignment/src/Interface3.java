

/**
 *3.Use Interface instances to call the implemented method in the implemented class
 * @author shruti
 * We can’t create instance(interface can’t be instantiated) of interface but
 * we can make reference of it that refers to the Object of its implementing class.
 */
interface Mango{
    void show();
}
class Fruit implements Mango
{
    public void show()
    {
        System.out.println("Hey!!I am interface Mango");
    }
}
public class Interface3 {
    public static void main(String[] args) {
          Mango m=new Fruit();
    m.show();
    }
  
}
