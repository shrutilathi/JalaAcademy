

/**
 *14.Write a program to generate NoSuchMethodException
 * @author shruti
 * A java.lang.NoSuchMethodError as the name suggests, is a runtime error in Java 
 * which occurs when a method is called that exists at compile-time,
 * but does not exist at runtime. 
 */
// Java Program to Demonstrate NoSuchMethodError by
// throwing it due to a breaking change
// introduced within an application

// Importingn I/O classes
import java.io.*;

// Class 1
// Helper class
class NoSuchMethodError {

	// Method 1
	// Void demo method created to be called
	// in another class containing main() method
	public void printer(String myString)
	{

		// Print statement
		System.out.println(myString);
	}
}

// Class 2
// Main class
public class Exception14 {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of class 1
		NoSuchMethodError obj = new NoSuchMethodError();

		// Now calling print() method which is not present
		// in NoSuchMethodErrorExample class, hence throwing
		// exception
//		obj.print("Hello World");
	}
}

