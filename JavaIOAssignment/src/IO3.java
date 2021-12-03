
import java.io.BufferedInputStream;
import java.io.FileInputStream;



/**
 *3.Read text from a .txt file using BufferedInputStream
 * @author shruti
 */
public class IO3 {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("file1.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1)
            {
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
