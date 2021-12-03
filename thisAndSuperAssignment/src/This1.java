

/**
 *1.Print the fields/instance members of the current class using this and without using object
 * @author shruti
 */
class AT
{
    int a=1;
    int b=90;
   public void sectionAT()
    {
        this.a=100;
        this.b=600;
        System.out.println(a);
        System.out.println(b);
    }

}
class BT
{
    int c;
    public void sectionBT()
    {
        this.c=50;
        System.out.println(c);
    }
}


public class This1 {
    public static void main(String[] args) {
        //Members of paren class using super
        new AT().sectionAT();
    }
}



