
import java.io.FileOutputStream;


/**
 *2.Write a program to write text to .txt file using OutputStream
 * @author shruti
 */
public class IO2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("file3.txt");
            String s="Welcome to java";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("Success..");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
