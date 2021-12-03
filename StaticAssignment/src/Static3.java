

/**
 *3.Print static variables in Instance method
 * @author shruti

 */
public class Static3 {

  static int a = 10; 
  //instance method need object
 void display() 
 { 
    System.out.println("This is an instance method");
     System.out.println("This is static variable : "+Static3.a);
 } 
static void show()
{ 
   System.out.println("This is a Static method"); 
 } 
public static void main(String[] args) 
{ 
   Static3 sm = new Static3(); 
    sm.display(); 
//   Static3 s = null; 
//    s.show(); 
   
  } 

}
