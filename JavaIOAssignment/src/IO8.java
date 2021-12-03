
import java.io.BufferedWriter;
import java.io.FileWriter;



/**
 *8.Write text to a .txt file using BufferedWriter
 * @author shruti
 */
public class IO8 {
    public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("D:\\testout.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to java...writting with buffered writer");  
    buffer.close();  
    System.out.println("Success..");  
    }  
}
