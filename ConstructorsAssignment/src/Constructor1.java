

/**
 *1.Write a class with a default constructor, one argument constructor and two argument 
constructors. Instantiate the class to call all the constructors of that class from a main 
class
 * @author shruti
 */

public class Constructor1 {
    int id;
    String name;
    int age;
    Constructor1(){
        System.out.println("This is Default Constructor");
    }
    Constructor1(int i,String n){
        id=i;
        name=n;
    }
    Constructor1(int i,String n,int a){
        id=i;
        name=n;
        age=a;
        
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String[] args) {
        Constructor1 obj=new Constructor1();
        Constructor1 obj1=new Constructor1(111,"Shruti");
       Constructor1 obj2=new Constructor1(222,"Khushi",18); 
       
       obj1.display();
       obj2.display();
       
    }
}
