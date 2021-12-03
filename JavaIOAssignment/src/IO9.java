
import java.io.FileReader;
import java.util.Properties;


/**
 *9.Write a program to read data from properties file
 * @author shruti
 */
public class IO9 {
    public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("db.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  
}  
}
