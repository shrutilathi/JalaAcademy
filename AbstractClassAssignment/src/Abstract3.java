
/**
 *3.Create an instance for the child class in child class and call abstract method
 * 4.Create an instance for the child class in child class and call non-abstract method
 * @author shruti
 */
abstract class Animal{
   //abstract method
    void name()
    {
        System.out.println("(Non-abstract method) Dog");
    }
   public abstract void sound();
   
}

public class Abstract3 extends Animal {
    public void sound(){
	System.out.println("(Abstract Method) Woof");
   }
   public static void main(String args[]){
	Abstract3 obj = new Abstract3();
	obj.sound();//calling abstract method
        obj.name();//calling non abstract method
   }
}
