
import java.lang.reflect.*;


/**
 *13.Write a program to generate NoSuchFieldException
 * @author shruti
 */
public class Exception13 {
      public static void main(String[] args) {  
   
      Exception13  obj = new Exception13();  
      Class class1 = obj.getClass();  //gets the class  
  
      System.out.println("Field got  =");  
      try {  
          
         Field Flds = class1.getField("str");  
         System.out.println(" field found: " + Flds.toString());  
      } catch(NoSuchFieldException e) {  
         System.out.println(e.toString());  
      }  
   }  
  
   public Exception13() {        
   }  
  
   public Exception13(String str) {         
      this.str = str;  
   }  
      
   public String str = "Shrutilathi";  
}
