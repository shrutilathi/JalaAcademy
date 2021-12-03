

/**
 *6.Create an interface with a default method and implement it in a class. Do not provide 
implementation to the default method and call the method
 * @author shruti
 */
interface Vehicle{
    String speedUp();
    String slowDown();
    default String turnAlarmOn()
    {
        return "turning the vehicle alarm on..";
    }
     default String turnAlarmOff()
    {
        return "turning the vehicle alarm off..";
    }
}
class Car implements Vehicle
{
    public String speedUp()
    {
        return "The car is Speeding up..";
    }
    public String slowDown()
    {
        return "The car is Slowing Down.." ;
    }
}
public class Interface6 {
    public static void main(String[] args) {
            Vehicle car = new Car();
            System.out.println(car.speedUp());
           
            System.out.println(car.turnAlarmOn());
             System.out.println(car.slowDown());
            System.out.println(car.turnAlarmOff());
    }

    
}
