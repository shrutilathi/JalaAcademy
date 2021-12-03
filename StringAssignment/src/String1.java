

/**
 *1.Different ways creating a string
 * 1.by string literals
 * 2.by new keyword
 * @author shruti
 */
public class String1 {
    public static void main(String[] args) {
        String s1="Shruti";//literals
        char ch[]={'g','o','o','d','g','i','r','l'};
        String s2=new String(ch);//converting char array to string
        String s3=new String("Lathi");//new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
