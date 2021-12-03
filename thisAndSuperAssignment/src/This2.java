

/**
 *2.Print the fields/instance members of the parent class using super
 * @author shruti
 */
class parent
{
    String First_Name;
    String Last_Name;
      parent(String first_Name,String Last_Name){
          this.First_Name=first_Name;
          this.Last_Name=Last_Name;
      }

}
class child extends parent{
    child(String first_Name,String Last_Name){
        super( first_Name, Last_Name);
    }
    void greet(){
        System.out.println("hello"+" "+First_Name+" "+Last_Name);

    }

}

public class This2 {
    public static void main(String[] args) {
        child c= new child("Shruti","Lathi");
        c.greet();


    }
}

