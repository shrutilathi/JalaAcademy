
/**
 *11.. Write a program to generate FileNotFoundException
 * 12.Write a program to generate IOException//filenotfound is io exception
 * @author shruti
 */
//Java program to demonstrate FileNotFoundException
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
class Exception11 {

	public static void main(String args[]) {
		try {

			// Following file does not exist
			File file = new File("E://file.txt");

			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
		System.out.println("File does not exist");
		}
	}
}


