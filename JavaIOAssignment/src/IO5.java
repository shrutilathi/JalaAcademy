
import java.io.FileReader;


/**
 *5.Write a program to read text from .txt file using FileReader
 * @author shruti
 */
public class IO5 {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("file1.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
}
