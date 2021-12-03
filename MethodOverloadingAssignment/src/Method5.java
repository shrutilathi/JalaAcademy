

/**
 *5.Write two methods with the same name, number of parameters and data type but 
different return Type
 * @author shruti
 */
public class Method5 {
    int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    //compilation error
//    double add(int a,int b)
//    {
//        double sum=a+b;
//        return sum;
//    }
    public static void main(String[] args) {
   
            Method5 obj=new Method5();
            int sum1=obj.add(10, 20);
            System.out.println("Sum of integer values "+sum1);
//            double sum=obj.add(10.2,11.2);
//            System.out.println("Sum of double values "+sum);
        
    }
}
