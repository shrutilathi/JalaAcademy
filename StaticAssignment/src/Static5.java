

/**
 *5.Call static methods in instance methods

 * @author shruti
 */
public class Static5 {
     static int a = 10; 
  //instance method need object
 void display() 
 { 
    System.out.println("This is an instance method");
Static5.show();
 } 
static void show()
{ 
   System.out.println("This is a Static method"); 
   
 } 
public static void main(String[] args) 
{ 
    Static5 obj=new Static5();
    obj.display();
  } 

}
