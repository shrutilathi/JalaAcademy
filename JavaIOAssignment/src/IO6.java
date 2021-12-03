
import java.io.FileWriter;


/**
 *6.Write a program to write text to .txt file using FileWriter
 * @author shruti
 */
public class IO6 {
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("file5.txt");    
           fw.write("Welcome to java...writting with filewriter");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}
