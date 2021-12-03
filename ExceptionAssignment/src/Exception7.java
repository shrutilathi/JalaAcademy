
/**
 *7.Write a program with finally block
 * @author shruti
 */
public class Exception7 {
    public static void main(String[] args) {
        int a=10,b=0,c,d[]={10,20,30};
        try{
            c=a/b;
            System.out.println(c);
            System.out.println(d[2]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("I am finallyy block");
        }
        
    }
}
