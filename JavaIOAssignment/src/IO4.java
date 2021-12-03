
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;



/**
 *4.Write text to a .txt file using BufferedOutputStream

 * @author shruti
 */
public class IO4 {
    public static void main(String[] args)  {
        try{
               FileOutputStream fout=new FileOutputStream("file4.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to java..written by buffered outputstream";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success..");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     
    }
}
