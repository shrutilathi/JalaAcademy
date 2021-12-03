

/**
 *6. Matching a String Against a Regular Expression With matches()
 * @author shruti
 */
// Java Program to Demonstrate Working of matches() Method
// of String class
  
// Main class
public class String6 {
  
    // Main driver method
    public static void main(String args[])
    {
  
        // Declaring and initializing a string
        // Input string
        String Str = new String("Welcome to homesweethome");
  
        // Display message for better readability
        System.out.print(
            "Does String contains regex (.*)home(.*) ? : ");
        // Testing if regex is present or not
        System.out.println(Str.matches("(.*)home(.*)"));
  
        // Display message for better readability
        System.out.print(
            "Does String contains regex home ? : ");
  
        // Testing if regex is present or not
        System.out.println(Str.matches("home"));
    }
}

