
/**
 *3.Write a method which throws exception, Call that method in main class without try block
 * @author shruti
 */
import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  

public class Exception3 {
    public static void main(String args[])throws IOException{//declare exception  
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}
