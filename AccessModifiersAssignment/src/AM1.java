
/**
 *1.Create a class with PRIVATE fields, private method and a main method.
 * Print the fields in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class.

 * @author shruti
 * In this example, we have created two classes A and AM1.
 * A class contains private data member and private method. 
 * We are accessing these private members from outside the class, 
 * so there is a compile-time error.
 */
class A{  
private int data=40;  
private void msg(){System.out.println("Hello java");}  
}  
class B extends A{
    A a=new A();
//    a.msg();
}   
public class AM1 {
    public static void main(String[] args) {
      A obj=new A();  
//   System.out.println(obj.data);//Compile Time Error  
//   obj.msg();//Compile Time Error    
    }
   
}
